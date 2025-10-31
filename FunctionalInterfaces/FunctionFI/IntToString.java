package FunctionalInterfaces.FunctionFI;

import java.util.function.Function;

//  Create a Function to convert an integer to a string.
public class IntToString {
    public static void main(String[] args) {
        
        Function<Integer,String> convertint = x -> x.toString();
        System.out.println(convertint.apply(213));
        
    }
}
