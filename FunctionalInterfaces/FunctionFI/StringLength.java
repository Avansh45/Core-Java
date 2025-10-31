package FunctionalInterfaces.FunctionFI;

import java.util.function.Function;

// Create a Function to find the length of a string.
public class StringLength {
    public static void main(String[] args) {
        
        Function<String,Integer> strLength = x -> x.length();
        
        String string = "Hamara Channel";
        System.out.println(strLength.apply(string));

    }
    
}
