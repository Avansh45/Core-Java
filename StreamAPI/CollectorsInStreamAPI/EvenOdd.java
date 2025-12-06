package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Partition numbers into even and odd.
public class EvenOdd {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,4,5,7,8,5,5,6,55,5,8,9,475,87,847,7,45,845,68,45);

        Map<Boolean,List<Integer>> list2 = list.stream()
            .collect(Collectors.partitioningBy(x -> x%2==0));

        System.out.println(list2);
    }
}
