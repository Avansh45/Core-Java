package LambdaExpressions.IntermidiateLevelProblems;
import java.util.*;
// Given a List<Integer>, use a lambda with removeIf() to remove odd numbers.

public class FilterEvenNums {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(2,5,4,7,8,6,5,1));
        list.removeIf(a-> a%2!=0);
        System.out.println(list);
    }
}
