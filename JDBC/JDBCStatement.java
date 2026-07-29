package JDBC;

import java.sql.*;

public class JDBCStatement {

    private static String url = "jdbc:mysql://localhost:3306/StudentDB";
    private static String username = "root";
    private static String password = "root123";

    public static void main(String[] args) {

        //NO NEED TO USE IN MODERN JAVA(JBBC)....DriverManage will automatically load the classes

//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        }catch(ClassNotFoundException e){
//            e.printStackTrace();
//        }



        try(Connection conn = DriverManager.getConnection(url,username,password)){

            Statement st = conn.createStatement();

            //CREATE DATABASE
//            String query = "CREATE DATABASE company_db";
//            st.executeUpdate(query);


            //CREATE TABLE
//            String query = "CREATE TABLE students (" +
//                    "rollno INT PRIMARY KEY AUTO_INCREMENT, " +
//                    "name VARCHAR(50) NOT NULL, " +
//                    "age INT NOT NULL ," +
//                      "marks DOUBLE NOT NULL" +
//                    ")";
//            Above query will be send to the java in this form........ + is just used for spliting the long query into one
//            "CREATE TABLE employees (id INT PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR(50) NOT NULL, last_name VARCHAR(50) NOT NULL, email VARCHAR(100) UNIQUE, hire_date DATE)"


            // TO INSERT DATA
//            String query = String.format("INSERT INTO Students(name,age,marks) VALUES ('%s', %o, %f) ", "Avansh",21,96.35);
//            int rowsAffected = st.executeUpdate(query);
//            if(rowsAffected>0){
//                System.out.println("Data Inserted Successfully !");
//            }else{
//                System.out.println("Data Not Inserted !");
//            }


            //TO RETRIEVE DATA FROM DB
//            String query = "select * from Students";
//            ResultSet rs = st.executeQuery(query);
//            while(rs.next()){
//                int rollno = rs.getInt("rollno");
//                String name = rs.getString("name");
//                int age = rs.getInt("age");
//                double marks = rs.getDouble("marks");
//                System.out.println("ROLL NO: "+rollno);
//                System.out.println("NAME: "+name);
//                System.out.println("AGE: "+age);
//                System.out.println("MARKS: "+marks);
//
//            }


            //TO UPDATE DATA
//            String query = String.format("UPDATE Students SET marks = %f WHERE name = '%s' ", 94.6,"Avansh");
//            int rowsAffected = st.executeUpdate(query);
//            if(rowsAffected>0){
//                System.out.println("Data UPDATED Successfully !");
//            }else{
//                System.out.println("Data Not UPDATED !");
//            }

            // TO DELETE ROW
            // Modern Java Text Block ...No "+" or "String.format" needed
//            String query = """
//                    DELETE FROM students
//                    WHERE id = 2
//                    """;



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
