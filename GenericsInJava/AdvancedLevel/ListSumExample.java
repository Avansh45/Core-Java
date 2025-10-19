package GenericsInJava.AdvancedLevel;
import java.util.*;
// Write a method sumOfList(List<? extends Number> list) that returns the sum of all numbers in the list.
public class ListSumExample {
    public static double sumOfList(List<? extends Number> list){
        double sum = 0;
        for(Number nums: list){
            sum+=nums.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>(Arrays.asList(21,1,5,87,5,6));
        System.out.println(sumOfList(intList));
        System.out.println();
        System.out.println(sumOfList(Arrays.asList(1.5, 2.5,5.9,23.4, 3.0)));
    }
}
