package OOPS.Projects.StudentGradingSystem;
import java.util.ArrayList;
import java.util.Scanner;
//*****This program doesnot catching Exceptions*****
// User needs to fill the details very carefully
public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = scan.nextInt();
        
        ArrayList<Student> students = new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.println("Enter the details for Student "+(i+1));
            
            scan.nextLine();
            System.out.println("Enter the Name:");
            String name =  scan.nextLine();
            System.out.println("Enter the Age:");
            int age =  scan .nextInt();
            System.out.println("Enter you Gender(M or F)");
            char gender = scan.next().charAt(0);
            gender = Character.toUpperCase(gender);
            System.out.println("Enter Your Roll No:");
            int rollNo = scan.nextInt();
            System.out.println("Enter your Marks:");
            double marks = scan.nextDouble();
            Student s = new Student(name,age,gender,rollNo,marks);
            students.add(s);
        }
        //Loop for printing the details after entered by the user
        for (int i = 0; i < students.size(); i++) {
            System.out.println("----Details of Student " + (i + 1) + ":----");
            students.get(i).display();
        }

        //Printing the Report card for every Student
        for (int i = 0; i < students.size(); i++) {
            System.out.println("\n********************");
            System.out.println("Report Card of Student " + (i + 1) + " ->");
            students.get(i).generateReport();
        }

        scan.close();
    }
}
