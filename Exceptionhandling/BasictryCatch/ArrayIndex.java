package Exceptionhandling.BasictryCatch;

// Create an array of size 5.
// Try to access an element at index 10 and handle the exception.


public class ArrayIndex {
    public static void main(String[] args) {
        

        int[] arr = new int[5];

        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println(e + "\nCannot access the 10th element as the size is 5");
        }
    }
}
