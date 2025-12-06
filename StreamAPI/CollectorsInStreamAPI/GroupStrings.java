package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of strings, group them by their length.
public class GroupStrings {
    public static void main(String[] args) {
     
        List<String> list = Arrays.asList("Apple","Mango","Orange","Guava","Pomegranate","Waatermelon");

        Map<Integer,List<String>> groupedList = list.stream()
            .collect(Collectors.groupingBy(str -> str.length()));
        
        System.out.println(groupedList);
    }
}
