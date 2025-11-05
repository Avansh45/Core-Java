package StreamAPI;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;
// List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
// 👉 Use reduce() to:
// Find the sum
// Find the maximum
// Find the minimum
public class ReduceExample {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        //Sum of Elements in the List
        Optional<Integer> sum = numbers.stream()
            .reduce((x,y)-> x+y);
        sum.ifPresent(x-> System.out.println(x));
        
        //MAximum Element in the list
        Optional<Integer> maximum = numbers.stream()
            .reduce((x,y) -> Math.max(x, y));
        maximum.ifPresent(x-> System.out.println(x));

        //Minimum Element in the list
        Optional<Integer> minimum = numbers.stream()
                .reduce((a,b) -> Math.min(a, b));
        minimum.ifPresent(z -> System.out.println(z));
    }
}
