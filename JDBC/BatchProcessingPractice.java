package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingPractice {

    private static final String url = "jdbc:mysql://localhost:3306/StudentDB";
    private static final String username = "root";
    private static final String password = "root123";

    public static void main(String[] args) {

//        String query = "INSERT INTO Students(name, age, marks) VALUES (?, ?, ?) ";
//        try(Connection connection = DriverManager.getConnection(url,username,password);
//            PreparedStatement ps = connection.prepareStatement(query)){
//            String[] names = {"Aman", "Rohit", "Neha"};
//            int[] ages = {20, 21, 20};
//            double[] marks = {81.5, 88.0, 92.5};
//            for(int i=0;i<3;i++){
//                ps.setString(1,names[i]);
//                ps.setInt(2,ages[i]);
//                ps.setDouble(3,marks[i]);
//                ps.addBatch();
//            }
//            int[] res = ps.executeBatch();
//            if(res.length ==names.length){
//                System.out.println("Data Inserted Successfully !!");
//            }else{
//                System.out.println("All data is not inserted !!");
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }

        //There may be multiple names so use id
        String query = "UPDATE Students SET marks = ? WHERE rollno = ? ";
        try(Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement ps = connection.prepareStatement(query)){


//            int[] rollnos = {4, 5, 6};
//            double[] marks = {85.0, 91.0, 95.0};
//
//            for(int i = 0; i < rollnos.length; i++) {
//
//                ps.setDouble(1, marks[i]);
//                ps.setInt(2, rollnos[i]);
//
//                ps.addBatch();
//            }


            ps.setDouble(1,85.0);
            ps.setInt(2,4);
            ps.addBatch();

            ps.setDouble(1,91.0);
            ps.setInt(2,5);
            ps.addBatch();

            ps.setDouble(1,95.0);
            ps.setInt(2,6);
            ps.addBatch();

            int[] result = ps.executeBatch();
            for(int i=0;i<result.length;i++){
                if(result[i] == 1)
                    System.out.println("Batch "+ (i+1) + " updated Successfully !!");
                else
                    System.out.println("Batch "+ (i+1) + " not Updated !!");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
