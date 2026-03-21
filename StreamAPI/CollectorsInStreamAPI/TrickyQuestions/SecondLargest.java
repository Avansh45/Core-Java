package StreamAPI.CollectorsInStreamAPI.TrickyQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Find the second highest number using streams and collectors.
public class SecondLargest {
    public static void main(String[] args) {
        
        List<Integer> numList = Arrays.asList(2,5,3,5,6,5,4,5,56,45);

        Optional<Integer> collect = numList.stream()
                    .distinct()
                    .sorted((a,b) -> b-a)
                    .skip(1)
                    .findFirst();
        System.out.println("Second Largest Element : "+collect.get());
    }
}
