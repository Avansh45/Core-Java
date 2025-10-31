package FunctionalInterfaces.FunctionFI;

import java.util.function.Function;

// Use Function.identity() to return the same input value.
public class IdentityMethod {
    public static void main(String[] args) {
        
        Function<String,String> stringFunction = str -> str;
        System.out.println(stringFunction.apply("Anshu"));
    }
}
