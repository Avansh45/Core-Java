package Exceptionhandling.BasictryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

// Read a number from the user using Scanner.
// Handle:
// InputMismatchException (if input is not an integer)
// ArithmeticException (if dividing by zero)
public class Multiplecatch {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        try{
            System.out.print("Enter the num : ");
            int num = s.nextInt();
            System.out.print("Enter the den : ");
            int den = s.nextInt();
            s.close();

            System.out.println("Division of given Numbers : "+(num/den));
       
        }catch(InputMismatchException i){

                System.out.println(i);
                System.out.println("Invalid input....Type integer value only !");
        }catch(ArithmeticException e){

            System.out.println(e.getMessage());
            System.out.println("Cannot Divide by Zero --- Enter den > 1");
        }
    }
    public static int divideNums(int n, int d){
        return n/d;
    }
}
