package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find the average of a list of integers.

// Use: Collectors.averagingInt()

public class AvgOfNums {
    public static void main(String[] args) {
        
        List<Integer> intList = Arrays.asList(21,54,78,98,65,23,54,62,84,59,1,64);

        double average = intList.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(average);
    }
}
