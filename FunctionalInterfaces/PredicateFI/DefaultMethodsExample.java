package FunctionalInterfaces.PredicateFI;

import java.util.function.Predicate;

// 4️⃣ Combine two predicates using and(), or(), and negate().
public class DefaultMethodsExample {
    public static void main(String[] args) {

        Predicate<Integer> numIsEven = x -> x % 2 == 0;
        Predicate<Integer> isPositive = x -> x>=0;
        

        Predicate<Integer> add = numIsEven.and(isPositive);
        System.out.println(add.test(52));
        
        Predicate<Integer> or = numIsEven.or(isPositive);
        System.out.println(or.test(52));

        Predicate<Integer> negate = numIsEven.negate();
        System.out.println(negate.test(512));
    }
}
