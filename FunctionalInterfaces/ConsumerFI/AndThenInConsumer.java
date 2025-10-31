package FunctionalInterfaces.ConsumerFI;

import java.util.function.Consumer;

// Chain two consumers using andThen() — one prints a number, the next prints its square.
public class AndThenInConsumer {
    public static void main(String[] args) {
        
        Consumer<Integer> num = n -> System.out.println(n);
        Consumer<Integer> square = n -> System.out.println(n*n);

        Consumer<Integer> andThen = num.andThen(square);
        andThen.accept(25);
    }
}
