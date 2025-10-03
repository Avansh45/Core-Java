package CollectionsFramework.Sets;

import java.util.HashSet;
import java.util.Set;

// Find elements that are in either of the two arrays but not in both (using Set operations).
public class SymmetricDifference {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> set3 = new HashSet<>(set1);
        Set<Integer> set4 = new HashSet<>(set2);
        set3.removeAll(set2);
        set4.removeAll(set1);

        set3.addAll(set4);
        System.out.println("SYmmetric Difference : "+set3);

    }   
}
