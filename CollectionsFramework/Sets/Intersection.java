package CollectionsFramework.Sets;

import java.util.HashSet;
import java.util.Set;
//Intersection of two Sets
public class Intersection {
    public static void main(String[] args) {


        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2); 
        set1.add(3); 
        set1.add(4);

        System.out.println("Set 1 : "+set1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        
        System.out.println("Set 2 : "+set2);

        //retailAll - It will keep the elements that are elements present in the set 2
        set1.retainAll(set2); 

        System.out.println("Intersection : " + set1);

    }
}
