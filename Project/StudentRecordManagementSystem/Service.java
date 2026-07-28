package Project.StudentRecordManagementSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Service {
    public void AddStudent(Scanner s){
        s.nextLine();
        System.out.println("Enter Student Details :");
        System.out.print("Name : ");
        String name = s.nextLine();
        System.out.print("Roll No : ");
        int roll = s.nextInt();
        System.out.print("Marks : ");
        int marks = s.nextInt();

        Student stu = new Student(roll, name, marks);
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt",true))) {

            bw.write(stu.getRoll() + "," + stu.getName() + "," + stu.getMarks());            
            bw.newLine();
            System.out.println("Student Details Added Successfully !");
        } catch (IOException e) {
            System.out.println("ERROR WHILE ADDING STUDENT DETAILS !");
            e.printStackTrace();
        }
        
    }
    public void viewStudents(){
        try(BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
            String line;
            System.out.println("        ####################");
            System.out.println("STUDENT DETAILS ARE : ");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("        ####################");
        }catch(IOException e){
            System.out.println("ERROR WHILE FETCHING STUDENT DETAILS !");
        }
    }

    public void searchStudent(Scanner s){
        System.out.println("Enter the roll no of student : ");
        int r = s.nextInt();

        try(BufferedReader br = new BufferedReader(new FileReader("students.txt"))){
            String line;
            boolean found = false;
            System.out.println("        ####################");
            while((line = br.readLine()) !=null){
                    String[] details = line.split(",");                
                    if(Integer.parseInt(details[0]) == r ){
                    System.out.println("ROLL NO " + r + " STUDENT DETAILS :");
                    System.out.println("Roll No : "+details[0]+", Name : "+details[1] + ", Marks : "+details[2]);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Student Data Doesn't exists !");
            }
            System.out.println("        ####################");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void deleteStudent(Scanner s) {
    System.out.print("Enter the roll no: ");
    int r = s.nextInt();

    File oldFile = new File("students.txt");
    File newFile = new File("temp.txt");

    boolean found = false;

    try (
        BufferedReader br = new BufferedReader(new FileReader(oldFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))
    ) {
        String line;

        System.out.println("####################");

        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");

            if (Integer.parseInt(details[0]) == r) {
                found = true;
                continue;
            }

            bw.write(line);
            bw.newLine();
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    if (!found) {
        System.out.println("Student Data Doesn't Exist!");
        newFile.delete(); // remove useless temp file
    } else {
        oldFile.delete();
        newFile.renameTo(oldFile);
        System.out.println("Student Deleted Successfully!");
    }

        System.out.println("####################");
    }
}