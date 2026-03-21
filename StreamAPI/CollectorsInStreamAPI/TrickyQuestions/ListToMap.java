package StreamAPI.CollectorsInStreamAPI.TrickyQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Convert a list of strings into a map where
// key = index, value = string.
// Use IntStream.range() with Collectors.toMap().
public class ListToMap {
    public static void main(String[] args) {

        List<String> strs = Arrays.asList("Anshu","Abhi","Jatin","Kartik","Krishna","Ram");

        Map<Integer,String> mapped =IntStream.range(0,strs.size())
                .boxed()
                .collect(Collectors.toMap(v -> v, v -> strs.get(v)));

        System.out.println(mapped);
    }
}
