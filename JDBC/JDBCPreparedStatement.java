package JDBC;

import java.sql.*;

public class JDBCPreparedStatement
{
    private static final String url = "jdbc:mysql://localhost:3306/StudentDB";
    private static final String username = "root";
    private static final String password = "root123";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            //INSERT DATA
//            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO Students(name,age,marks) VALUES (?,?,?)  ");
//            preparedStatement.setString(1,"Rahul");
//            preparedStatement.setInt(2,22);
//            preparedStatement.setDouble(3,87.5);
//            int rows = preparedStatement.executeUpdate();
//            if(rows>0){
//                System.out.println("Student inserted successfully !!");
//            }else{
//                System.out.println("Student Not inserted !!");
//            }

            //Retrieve DATA
//            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM Students WHERE rollno = ? ");
//            preparedStatement.setInt(1,1);
//            ResultSet data = preparedStatement.executeQuery();
//            //If Statement, because i know only one rows will come
//            while(data.next()){
//                int rollno = data.getInt("rollno");
//                String name = data.getString("name");
//                int age = data.getInt("age");
//                double marks = data.getDouble("marks");
//
//                System.out.println("ROLL NO : "+rollno);
//                System.out.println("NAME : "+name);
//                System.out.println("AGE : "+age);
//                System.out.println("MARKS : "+marks);
//
//            }else{
//                System.out.println("DATA Not Found !!!");
//            }

            //UPDATE Data
//            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE Students SET marks = ? WHERE name =  ? ");
//            preparedStatement.setDouble(1,91.75);
//            preparedStatement.setString(2,"Rahul");
//            int rowsAffected = preparedStatement.executeUpdate();
//            if(rowsAffected>0){
//                System.out.println("Data Updated Successfully !!");
//            }else{
//                System.out.println("Data Not Updated !!");
//            }

            //DELETE Data
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM Students WHERE name = ? ");

            preparedStatement.setString(1,"Rahul");
            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("Data Deleted Successfully !!");
            }else{
                System.out.println("Data Not Found !!");
            }
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
