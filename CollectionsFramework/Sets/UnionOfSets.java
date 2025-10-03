package CollectionsFramework.Sets;

import java.util.Arrays;
import java.util.HashSet;


// Take two integer arrays and find their union using Set.
public class UnionOfSets {
    public static void main(String[] args) {
        
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};

        HashSet<Integer> setA = new HashSet<>(Arrays.asList(array1));
        System.out.println("First Set: "+setA);

        HashSet<Integer> setB = new HashSet<>(Arrays.asList(array2));
        System.out.println("Second Set: "+setB);
        
        setA.addAll(setB);
        System.out.println("Union of Set A and Set B : "+setA);
  
    }
}
