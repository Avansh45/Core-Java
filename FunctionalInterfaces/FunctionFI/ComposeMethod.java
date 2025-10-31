package FunctionalInterfaces.FunctionFI;

import java.util.function.Function;

// Use andThen() to multiply a number by 2 and then add 10.
// Use compose() to reverse the above order.
public class ComposeMethod {
    public static void main(String[] args) {
        
        Function<Integer,Integer> multiply = o -> o * o;
        Function<Integer,Integer> add = x -> x + 10;

        Function<Integer,Integer> compose = multiply.compose(add);
        System.out.println(compose.apply(12));
    }
}
