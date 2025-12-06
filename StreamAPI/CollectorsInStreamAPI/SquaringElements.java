package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Convert a list of integers into a list of their squares using toList().
public class SquaringElements {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(8,6,5,4,9,7,2,3,12,15);
        System.out.println(nums);
        List<Integer> squares = nums.stream()
            .map(x->x*x)
            .collect(Collectors.toList());
            // squares.forEach(System.out::println);
            System.out.println(squares);
            

    }
}
