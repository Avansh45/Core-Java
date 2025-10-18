package Exceptionhandling.BasictryCatch;


// Write a program to take two integers and print their division.
// Handle ArithmeticException if the denominator is 0.

public class DivideByZero {
    public static void main(String[] args) {
        
        try{
            System.out.println(divide(25, 0));
        }
        catch(ArithmeticException o){

            System.out.println(o);
        }
    }

    static int divide(int num, int den){
        return num/den;
    }
}
