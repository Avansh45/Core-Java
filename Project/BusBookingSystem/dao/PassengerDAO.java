package Project.BusBookingSystem.dao;

import Project.BusBookingSystem.database.DBConnection;
import Project.BusBookingSystem.model.Gender;
import Project.BusBookingSystem.model.Passenger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PassengerDAO {


    public boolean addPassenger(Passenger passenger){

        final String query = "INSERT INTO Passenger(passenger_name,age,gender,phone) VALUES (?,?,?,?)";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query)){

            ps.setString(1,passenger.getPassengerName());
            ps.setInt(2,passenger.getAge());
            ps.setString(3,passenger.getGender().name());
            ps.setString(4,passenger.getPhone());

            int affectedRows = ps.executeUpdate();
            if(affectedRows == 1){
                return true;
            }
            return false;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public List<Passenger> getAllPassengers(){

        List<Passenger> passengersList = new ArrayList<>();
        final String query = "SELECT * FROM Passenger";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){
            while(rs.next()){

                passengersList.add(mapResultSetToPassenger(rs));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return passengersList;
    }
    public Optional<Passenger> searchPassenger(String phone){
        final String query = "SELECT * FROM Passenger WHERE phone = ?";
        Passenger passenger = null;
        try(Connection connection = DBConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,phone);
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    passenger = mapResultSetToPassenger(rs);

                }
            }
        }catch (SQLException e){
            System.out.println("Error while searching passenger.");
            e.printStackTrace();
            return Optional.empty();
        }
            return Optional.ofNullable(passenger);
    }

    private Passenger mapResultSetToPassenger(ResultSet rs) throws SQLException{
            Passenger passenger = new Passenger(rs.getInt("passenger_id"),rs.getString("passenger_name"),rs.getInt("age"),Gender.valueOf(rs.getString("gender")),rs.getString("phone"));
            return passenger;
    }

}
