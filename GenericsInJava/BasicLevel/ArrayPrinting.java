package GenericsInJava.BasicLevel;


// Write a generic method printArray() that takes an array of any type and prints its elements.
public class ArrayPrinting {
    
    static <T> void printArray(T[] arr){
        for(T element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Integer[] intArray = {12, 56, 45, 56, 89, 87};
        printArray(intArray);

        String[] stringArray = {"Aditya","Aarush","Shreya","Aarav","Avika"};
        printArray(stringArray);
    }
}
