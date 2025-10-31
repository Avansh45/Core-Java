package FunctionalInterfaces.FunctionFI;

import java.util.function.Function;

// Use andThen() to multiply a number by 2 and then add 10.
public class AndThenInFunction {
    public static void main(String[] args) {
        
        Function<Integer,Integer> multiply = o -> o * o;
        Function<Integer,Integer> add = x -> x + 10;

        Function<Integer,Integer> function = multiply.andThen(add);
        System.out.println(function.apply(5));


        
    }
}
