package JDBC;

import java.sql.*;

public class TransactionExample {

    private static String URL = "jdbc:mysql://localhost:3306/StudentDB";
    private static String USERNAME = "root";
    private static String PASSWORD = "root123";
    public static void main(String[] args) {

        String query = "UPDATE Students SET marks = ? WHERE rollno = ? ";
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            connection.setAutoCommit(false);
            try(PreparedStatement ps = connection.prepareStatement(query)){

                int[] rollnos = {4, 5, 6};
                double[] marks = {99.0, 88.0, 84.0};
                for (int i = 0; i < rollnos.length; i++) {

                    ps.setDouble(1, marks[i]);
                    ps.setInt(2, rollnos[i]);

                    ps.addBatch();
                }
                int[] result = ps.executeBatch();
                boolean success = true;
                for (int i = 0; i < result.length; i++) {
                    if(result[i]!=1 && result[i] != Statement.SUCCESS_NO_INFO) {
                        success = false;
                        break;
                    }
                }
                if(success) {
                    connection.commit();
                    System.out.println("Transaction Successful !!");
                }
                else{
                    connection.rollback();
                    System.out.println("Transaction Failed !!!");
                }
            }catch(SQLException e){
                try{
                    connection.rollback();
                    System.out.println("Error occured .. Transaction failed !!");
                }
                catch(SQLException error){
                    error.printStackTrace();
                }
            }



        }catch(SQLException e){
            System.out.println("DATABASE ERROR !!!!!!!!!!");
            System.out.println(e.getMessage());
        }
    }

}
























