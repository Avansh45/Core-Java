package CollectionsFramework.List.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Problem 3 — Merge two lists....
// Merge two ArrayLists of integers into a third ArrayList.
// Sort the merged list in ascending and descending order using Collections.sort()
public class MergeLists {
    public static void main(String[] args) {
        
        List<Integer> l1 = Arrays.asList(3,8,4,6,1,12);
        System.out.println("List 1 : "+l1);
        List<Integer> l2 = Arrays.asList(5,7,9,11,2,10);
        System.out.println("\nList 2 : "+l2);
        //Cannot add elements to the above lists as they are fixed

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);

        System.out.println("\nList 3 before Sorting : "+l3);
        Collections.sort(l3);
        System.out.println("\nAscending Order of List 3: "+l3);

        // Sorting with a custom comparator
        // Collections.sort(l3, (a, b) -> b-a);
        Collections.sort(l3,Collections.reverseOrder());
        // Collections.reverse(l3);
        System.out.println("\nDescending Order of List 3 : "+l3);
        
        
    }
}
