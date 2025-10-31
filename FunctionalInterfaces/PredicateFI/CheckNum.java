package FunctionalInterfaces.PredicateFI;

import java.util.function.Predicate;

// 1️⃣ Create a Predicate to check if a number is positive.
public class CheckNum {
    public static void main(String[] args) {
        
        Predicate<Integer> isPositive = a -> a >=0; //Condition to check the num is +ve or not

        System.out.println(isPositive.test(11256));

        System.out.println(isPositive.test(0));

        System.out.println(isPositive.test(-9658));
    }
}
