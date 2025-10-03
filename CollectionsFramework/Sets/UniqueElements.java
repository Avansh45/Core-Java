package CollectionsFramework.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

// Find the number of unique elements in an array or list.
public class UniqueElements {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,25,36,78,54,87,5,6,5,4,8,4,5,2,6,5,4,25,8));
        System.out.println("Original List :"+list);


        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("Unique Elements are : "+set);

        TreeSet<Integer> tree = new TreeSet<>(set);
        System.out.println("Unique Sorted Elements : "+tree);
    }
}
