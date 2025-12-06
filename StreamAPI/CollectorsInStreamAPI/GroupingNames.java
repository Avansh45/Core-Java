package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// Group names based on their starting character.
public class GroupingNames {
    public static void main(String[] args) {
        
        String[] strs = {"Avneet","Rajat","Shikhar","Elvish","Karan","Badshah","Akshit","Karamjeet","Rohit"};

        Map<Character,List<String>> mappedArray = Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(mappedArray);
    }
}
