package StreamAPI.CollectorsInStreamAPI;


import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

// Convert a Stream<String> into a set of distinct first characters.
public class StreamToSet {
    public static void main(String[] args) {
        
        Stream<String> strs = Stream.of("apple", "banana", "apricot", "ball");
        strs.forEach(System.out::println);
        
        Stream<String> strs1 = Stream.of("apple", "banana", "apricot", "ball");
        Set<Character> charSet = strs1
                    .map(s -> s.charAt(0))
                    .collect(Collectors.toSet());
        
        System.out.println(charSet);
    }
}
