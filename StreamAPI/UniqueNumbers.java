package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
// Given a list of integers (with duplicates),
// remove duplicates,
// take the first 5 unique numbers, and
// find their sum using reduce().

public class UniqueNumbers {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,5,6,7,5,45,56,89,23,45);
        Optional<Integer> newList = list.stream()
        .distinct()
        .limit(5)
        .reduce((x,y) -> x+y);
        newList.ifPresent(System.out::println);
        
    }
}
