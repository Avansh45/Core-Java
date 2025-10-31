package FunctionalInterfaces.ConsumerFI;

import java.util.function.Consumer;

// Create a Consumer that prints a string.
public class printingString {
    public static void main(String[] args) {
        
        Consumer<String> printingConsumer = s -> System.out.println(s);
        printingConsumer.accept("Java Programming !");
    }
}
