package FunctionalInterfaces.PredicateFI;

import java.util.*;
import java.util.function.Predicate;

// 3️⃣ Use Predicate with a list to filter numbers greater than 10.
public class FilterNumbers {
    public static void main(String[] args) {
        
        List<Integer> numsList = Arrays.asList(2,5,4,56,5,85,41,36,254,1,34,2,152);

        Predicate<Integer> numsGreaterThenTen = n -> n>10;
        for (Integer i : numsList) {
            if(numsGreaterThenTen.test(i)){
                System.out.println(i);
            }
        }
    }
}
