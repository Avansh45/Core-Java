package Exceptionhandling.CustomExceptions;

import java.util.Scanner;

// Create a Student class that accepts marks from 0–100.
// If marks are outside this range, throw a custom exception InvalidMarksException.
// Handle it and print an error message.

class InvalidMarksException extends Exception{

    @Override
    public String getMessage(){
        return " Marks must be greater than 0 or less than 100";
    }

}
class Student{
    private double marks;
    

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    void validateMarks(double marks) throws InvalidMarksException{
        if(marks<0 || marks>100){
            throw new InvalidMarksException();
        }
        else{
            System.out.println("Your Marks : "+marks);
        }
    }

}
public class MarksValidationException {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter Marks : ");
        double marks = obj.nextDouble();
        obj.close();

        try{
            s.validateMarks(marks);
        }catch(InvalidMarksException e){
            
            System.out.println(e.getLocalizedMessage());
        }
    }
}
