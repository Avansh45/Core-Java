package Exceptionhandling.ThrowAndThrows;

// Create a method checkEven(int num) that throws Exception if the number is odd.
// Use throws keyword in method signature.
// Handle it in main() using try-catch.
public class CheckEvenException {

    static void checkEven(int num) throws Exception{
        if(num%2==0) System.out.println("Even Number !");
        throw new Exception("Number is Odd ---- Not Allowed");
    }

    public static void main(String[] args) {
     
        try{
            checkEven(5);
        }catch(Exception e){
            System.out.println("Exception Caught! "+e.getMessage());
        }
    }
}
