package Project.BusBookingSystem.dao;

import Project.BusBookingSystem.database.DBConnection;
import Project.BusBookingSystem.model.Booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Project.BusBookingSystem.model.BookingStatus;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {

    public boolean bookTicket(Booking booking) {

        try (Connection connection = DBConnection.getConnection()) {

            connection.setAutoCommit(false);

            try {

                if (!busExists(connection, booking.getBusId())) {
                    connection.rollback();
                    return false;
                }

                if (!passengerExists(connection, booking.getPassengerId())) {
                    connection.rollback();
                    return false;
                }

                if (!hasAvailableSeats(connection, booking.getBusId())) {
                    connection.rollback();
                    return false;
                }

                if (seatAlreadyBooked(connection, booking.getBusId(), booking.getSeatNumber())) {
                    connection.rollback();
                    return false;
                }

                if (!insertBooking(connection, booking)) {
                    connection.rollback();
                    return false;
                }

                if (!updateAvailableSeats(connection, booking.getBusId())) {
                    connection.rollback();
                    return false;
                }

                connection.commit();
                return true;

            } catch (SQLException e) {

                connection.rollback();
                throw e;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    private boolean busExists(Connection connection, int busId) {

        final String query = "SELECT 1 FROM Bus WHERE bus_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, busId);
            try (ResultSet rs = ps.executeQuery()) {

                return rs.next();
            }

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    private boolean passengerExists(Connection connection, int passengerId){

        final String query = "SELECT 1 FROM Passenger WHERE passenger_id = ?";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,passengerId);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    private boolean seatAlreadyBooked(Connection connection, int busId, int seatNumber){

        final String query = "SELECT 1 FROM Booking WHERE bus_id = ? AND seat_number=?";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,busId);
            ps.setInt(2,seatNumber);

            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    private boolean hasAvailableSeats(Connection connection, int busId) {

        final String query =
                "SELECT 1 FROM Bus WHERE bus_id = ? AND available_seats > 0";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, busId);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean insertBooking(Connection connection, Booking booking) {

        final String query =
                "INSERT INTO Booking (bus_id, passenger_id, seat_number, booking_status) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, booking.getBusId());
            ps.setInt(2, booking.getPassengerId());
            ps.setInt(3, booking.getSeatNumber());
            ps.setString(4, booking.getBookingStatus().name());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean updateAvailableSeats(Connection connection, int busId) {

        final String query =
                "UPDATE Bus SET available_seats = available_seats - 1 WHERE bus_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, busId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<Booking> getAllBookings() {

        List<Booking> bookingList = new ArrayList<>();

        final String query = "SELECT * FROM Booking";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                bookingList.add(mapResultSetToBooking(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bookingList;
    }

    private Booking mapResultSetToBooking(ResultSet rs) throws SQLException {

        return new Booking(
                rs.getInt("booking_id"),
                rs.getInt("bus_id"),
                rs.getInt("passenger_id"),
                rs.getInt("seat_number"),
                BookingStatus.valueOf(rs.getString("booking_status")),
                rs.getTimestamp("booking_date_time").toLocalDateTime()
        );
    }

    public boolean cancelBooking(int bookingId) {

        Connection connection = null;

        try {

            connection = DBConnection.getConnection();
            connection.setAutoCommit(false);

            int busId = getBusIdFromBooking(connection, bookingId);

            if (busId == -1) {
                connection.rollback();
                return false;
            }

            if (!deleteBooking(connection, bookingId)) {
                connection.rollback();
                return false;
            }

            if (!increaseAvailableSeats(connection, busId)) {
                connection.rollback();
                return false;
            }

            connection.commit();
            return true;

        } catch (SQLException e) {

            try {
                if (connection != null)
                    connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
            return false;

        } finally {

            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private int getBusIdFromBooking(Connection connection, int bookingId) {

        final String query =
                "SELECT bus_id FROM Booking WHERE booking_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, bookingId);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return rs.getInt("bus_id");
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    private boolean deleteBooking(Connection connection, int bookingId) {

        final String query =
                "DELETE FROM Booking WHERE booking_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, bookingId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean increaseAvailableSeats(Connection connection, int busId) {

        final String query =
                "UPDATE Bus SET available_seats = available_seats + 1 WHERE bus_id = ?";

        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, busId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
