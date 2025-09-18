package OOPS.ClassesAndObjects;
import java.util.Scanner;
class Student{
    int rollno;
    String name;
    double marks;
    
    Student(int rollno, String name, double marks){
        this.rollno = rollno;
        this.name= name;
        this.marks = marks;
    }

    char calculateGrades(){
        // char grade;
        // if(marks>=90){
        //     grade= 'A';
        // }
        // else if(marks>=75){
        //     grade= 'B';
        // }
        // else if(marks>=60){
        //     grade= 'C';
        // }
        // else{
        //     grade='D';
        // }
        // return grade;
        return switch((int)marks/10){
            case 10,9 -> 'A';
            case 8,7 -> 'B';
            case 6 -> 'C';
            default -> 'D';
        };
    }

    void displayDetails(){
        System.out.println("Roll No.: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Grades : "+calculateGrades());
    }
}
public class StudentProg {
    public static void main(String []args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Students:");
        int n = scan.nextInt();
        Student[] Students = new Student[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the details for Student "+(i+1)+" :");
            System.out.println("Enter the Roll number:");
            int rollno = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the Name:");
            String name = scan.nextLine();
            System.out.println("Enter the Marks:");
            double marks = scan.nextDouble();
            Students[i] = new Student(rollno, name, marks);
        }

        for(int i=0; i<n; i++){
            System.out.println("Details for Student "+(i+1)+" :->");
            Students[i].displayDetails();
        }
        scan.close();

    }
}
