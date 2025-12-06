package StreamAPI.CollectorsInStreamAPI;
import java.util.*;
import java.util.stream.Collectors;

// Find max value using collectors.
public class FindMax {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(21,45,56,78,69,23,42,53,75,86,51,59);

        Optional<Integer> max = list.stream().collect(Collectors.maxBy((a,b) ->a-b));
        System.out.println(max);

    }
}
