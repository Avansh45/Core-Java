package StreamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
// Given a list of strings,
// keep only the words that start with 'A' or 'a',
// convert them to uppercase,
// sort them alphabetically, and
// print each one.
public class StringExample {
    public static void main(String[] args) {
        
        String[] names = {"Amit", " Sumit", "Abhishek", "Rohan", "Dikshit"};
        Stream<String> myStream = Arrays.stream(names).map(String::trim).filter(x -> x.startsWith("a") || x.startsWith("A")).map(str -> str.toUpperCase());
        List<String> myList = myStream.sorted().collect(Collectors.toList());
        myList.forEach(System.out::println);
    }
}
