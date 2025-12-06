package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Remove duplicates from a list using toSet().
public class RemoveDuplicates {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9);
        System.out.println(list);

        Set<Integer> newlist =list.stream()
            // .distinct()
            .collect(Collectors.toSet());

            System.out.println(newlist);
    }
}
