package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers,
// filter only even numbers,
// square each of them, and
// collect the result into a new list.
public class EvenNums {
    public static void main(String[] args) {
        
        List<Integer> intList = Arrays.asList(1,2,5,4,8,6,9,8,4,5,7,2,5,7,9);

        // List<Integer> myFilteredList=      --->     optional as we are using peek for printing
                    intList.stream()
                    .filter(a -> a % 2 == 0)
                    .map(x -> x*x)
                    .peek(x -> System.out.println(x))
                    .collect(Collectors.toList());

        // Stream<Integer> mystream= intList.stream().filter(a -> a % 2 == 0).map(x -> x*x);
        // mystream.forEach(System.out::println);
    }
}
