package CollectionsFramework.List.ArrayList;

import java.util.ArrayList;

// Program to Find largest and smallest number without using Collections.max() / min().
public class LargestAndSmallest {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(47);
        list.add(32);
        list.add(35);
        list.add(25);
        list.add(41);
        list.add(76);
        list.add(2);
        list.add(35);

        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if(integer>maxElement){
                maxElement =integer;
            }
            if(integer<minElement){
                minElement = integer;
            }
        }
        System.out.println("Maximum Element in the List : "+maxElement);
        System.out.println("Minimum Element in the List : "+minElement);
    }
}
