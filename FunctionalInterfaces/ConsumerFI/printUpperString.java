package FunctionalInterfaces.ConsumerFI;

import java.util.function.Consumer;

// Create a Consumer that prints a string in uppercase.
public class printUpperString {
    public static void main(String[] args) {
        
        Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
        consumer.accept("java programming is the most popular language !");
    }
    
}
