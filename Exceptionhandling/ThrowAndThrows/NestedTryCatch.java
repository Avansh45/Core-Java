package Exceptionhandling.ThrowAndThrows;
// Create nested try-catch blocks:
// Inner block causes ArrayIndexOutOfBoundsException
// Outer block causes NullPointerException
// Handle both separately.
public class NestedTryCatch {
    public static void main(String[] args) {
        
        try{
           
            try{
                int arr[] = new int[6];
                System.out.println(arr[98]);
            }catch(ArrayIndexOutOfBoundsException E){
                System.out.println("Cannot acces the out of index element!");
                System.out.println(E.getMessage());
            }

            String str = null;
            System.out.println(str.charAt(2));
        }catch(NullPointerException e){

            System.out.println("cannot access the character from the null String!");
            System.out.println(e.getMessage());
        }
    }
}
