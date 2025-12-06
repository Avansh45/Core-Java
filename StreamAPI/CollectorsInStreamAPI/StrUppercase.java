package StreamAPI.CollectorsInStreamAPI;
import java.util.*;
import java.util.stream.Collectors;
// Convert a list of strings into a list of uppercase strings using toList().
public class StrUppercase {
    public static void main(String[] args) {
        
        List<String> strList = Arrays.asList("amit","roshan","singh","rakhi","amit","lawrence");
        System.out.println(strList);

        List<String> newList = strList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
                
                System.out.println(newList);

    }
}
