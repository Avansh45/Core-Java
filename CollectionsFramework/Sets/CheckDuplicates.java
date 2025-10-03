package CollectionsFramework.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

// Given an array, return true if there is any duplicate element, otherwise false.
public class CheckDuplicates{
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        System.out.print("Enter the total numbers: ");
        int n = o.nextInt();
        System.out.println("Enter the Elements :");
        ArrayList<Integer> array = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            array.add(o.nextInt());
        }
        
        System.out.println("Original List: "+array);

        HashSet<Integer> set = new HashSet<>(array);
        
        if(array.size() == set.size()){
            System.out.println("false(No Duplicates)");
        }
        else{
            System.out.println("true (Duplicates)");
        }
        o.close();
    }
}