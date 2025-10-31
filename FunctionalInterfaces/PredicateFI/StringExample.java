package FunctionalInterfaces.PredicateFI;

import java.util.function.Predicate;

// Create a Predicate to check if a string starts with “A”.
public class StringExample {
    public static void main(String[] args) {
        
        Predicate<String> startsWithA = x -> x.toUpperCase().charAt(0) == 'A';
        String str1 = "AmritMaan";
        String str2 = "amar jot";
        System.out.println(startsWithA.test(str1));
        System.out.println(startsWithA.test(str2));
    }
}
