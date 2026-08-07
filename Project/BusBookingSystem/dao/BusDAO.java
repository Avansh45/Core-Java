package Project.BusBookingSystem.dao;

import Project.BusBookingSystem.database.DBConnection;
import Project.BusBookingSystem.model.Bus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class BusDAO {


    public boolean addBus(Bus bus){

        final String query = "INSERT INTO Bus (bus_name,source, destination,departure_time,arrival_time," +
                    "total_seats,available_seats,ticket_price,bus_type) VALUES (?, ?, ?, ?, ?, ? , ?, ?, ? )";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query))
        {
            ps.setString(1,bus.getBusName());
            ps.setString(2,bus.getSource());
            ps.setString(3,bus.getDestination());
            ps.setTime(4,bus.getDepartureTime());
            ps.setTime(5,bus.getArrivalTime());
            ps.setInt(6,bus.getTotalSeats());
            ps.setInt(7,bus.getAvailableSeats());
            ps.setDouble(8,bus.getTicketPrice());
            ps.setString(9,bus.getBusType());

            int affectedRows = ps.executeUpdate();

            if(affectedRows==1)
                return true;

            return false;

        } catch (SQLException e) {

            System.out.println("Error while adding Bus !!");
            e.printStackTrace();
            return false;
        }

    }
    public List<Bus> getAllBuses(){
        final String query = "SELECT * FROM Bus";
        List<Bus> busList = new ArrayList<>();
        try(Connection connection= DBConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery()){

                while(rs.next()) {

                    busList.add(mapResultSetToBus(rs));
                }

            } catch(SQLException e){
            e.printStackTrace();
        }
        return busList;
    }
    public List<Bus> searchBus(String source, String destination){

        final String query = "SELECT * FROM Bus WHERE LOWER(source)=LOWER(?) AND LOWER(destination)=LOWER(?) ";
        List<Bus> searchedBus = new ArrayList<>();
        try(Connection connection = DBConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,source);
            ps.setString(2,destination);

            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()) {


                    searchedBus.add(mapResultSetToBus(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return searchedBus;
    }

    private Bus mapResultSetToBus(ResultSet rs) throws SQLException{
        return new Bus(
                rs.getInt("bus_id"),
                rs.getString("bus_name"),
                rs.getString("source"),
                rs.getString("destination"),
                rs.getTime("departure_time"),
                rs.getTime("arrival_time"),
                rs.getInt("total_seats"),
                rs.getInt("available_seats"),
                rs.getDouble("ticket_price"),
                rs.getString("bus_type")
        );
    }
}
