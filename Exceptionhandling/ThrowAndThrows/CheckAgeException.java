package Exceptionhandling.ThrowAndThrows;

import java.util.Scanner;

// Create a method checkAge(int age) that throws ArithmeticException (using throw new ArithmeticException(...)) if age < 18.
// Catch it in main() and print “Not eligible to vote”.
public class CheckAgeException {

    static void checkAge(int age) throws ArithmeticException{

        if(age>18) System.out.println("You are eligible to vote !");
        else throw new ArithmeticException("Not Eligible to Vote !");
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Age :");
        int age = s.nextInt();
        s.close();
        try{
            checkAge(age);
        }catch(ArithmeticException e){

            System.out.println("Age Must be greater than 18 !");
            System.out.println(e.getMessage());
        }
        
    }
}
