package Project.StudentRecordManagementSystem;

import java.io.*;
import java.util.*;
// Mini Project: Student Record Management System (File-Based)
// Project Idea

// A system where you can:

// Add student details
// View all students
// Search a student
// Delete a student

// All data stored in a file (no database)


public class Main {
    public File  file = new File("students.txt");
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Service stu = new Service();
        boolean flag = false;
        while(!flag){
            System.out.println("********************************");
            System.out.println("Student Management Menu : ");
            System.out.println("1. Add Student ");
            System.out.println("2. View Student details ");
            System.out.println("3. Search Student by Roll no. ");
            System.out.println("4. Delete the student data ");
            System.out.println("5. Exit ");

            System.out.println("Enter Choice (1,2,3,4,5) : ");
            int choice = s.nextInt();
            switch(choice){
                case 1 : {
                    stu.AddStudent(s);
                    break;
                }
                case 2 : {
                    stu.viewStudents();
                    break;
                }
                case 3 :
                    stu.searchStudent(s);
                    break;
                
                case 4 :
                    stu.deleteStudent(s);
                    break;

                case 5 :
                    flag = true;
                    break;
            }



        }
    }
}
