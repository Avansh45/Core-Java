package Project.BusBookingSystem.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static String URL = "jdbc:mysql://localhost:3306/BusBookingDB";
    private static String USERNAME = "root";
    private static String PASSWORD ="root123";

    public static Connection getConnection() throws SQLException{

        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}
