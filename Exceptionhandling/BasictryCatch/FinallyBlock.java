package Exceptionhandling.BasictryCatch;


// Write a method that has a try, catch, and finally block.
// Inside try, print something and cause an error (like divide by zero).
// Observe that finally always executes, even after an exception.
public class FinallyBlock {
    public static void main(String[] args) {
        
        
        try{
            System.out.println(22/0);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Divide by Zero exception occured !");
        }
        finally{
            System.out.println("\n\t**********\nThis will always execute !\n\t**********");
        }
    }
}
