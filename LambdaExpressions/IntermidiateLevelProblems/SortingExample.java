package LambdaExpressions.IntermidiateLevelProblems;
// Given a List<String>, sort it using Collections.sort() and a lambda comparator.
import java.util.*;
public class SortingExample {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(Arrays.asList("Amrit","Karan","Arjan","Dilpreet","Diljit"));
        list.sort((a,b)-> b.length()-a.length());
        // list.sort((a,b)-> b.compareTo(a));
        System.out.println(list);
    }
}
