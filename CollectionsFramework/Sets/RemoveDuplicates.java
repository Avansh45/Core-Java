package CollectionsFramework.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

//Program to remove Duplicates from List
//Same logic can be performed on the String Lists
public class RemoveDuplicates {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,5,8,65,6,2,5,8,6,45,8));
        System.out.println("Array with Duplicate Elements: "+list1);
        //As we know Set doesnot allow duplicates
        HashSet<Integer> set = new HashSet<>(list1);
        System.out.println("After Removing Duplicates: "+set);

        TreeSet<Integer> tree = new TreeSet<>(set);
        System.out.println("Sorted Elements: "+tree);

    }
}
