package OOPS.Projects.StudentGradingSystem;

public class Student extends Person implements Reportable {
    private double marks;
    private int rollNo;

    Student(String name, int age, char gender, int rollNo,double marks) {
        super(name, age, gender);
        this.rollNo= rollNo;
        this.marks = marks;

    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }
    
     public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    void display() {
        System.out.println("Name:" + getName() );
        System.out.println(" Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Roll No:"+getRollNo());
        System.out.println("Marks:"+getMarks());
    }

    public void generateReport(){

            double mark = getMarks();
            display();
            if (mark >= 90) {
                System.out.println("Grade: A");
            } else if (mark >= 85) {
                System.out.println("Grade: B");
            } else if (mark >= 65) {
                System.out.println("Grade: C");
            } else if (mark >= 55) {
                System.out.println("Grade: D");
            } else if (mark >= 45) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }

    }
   
}