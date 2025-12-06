package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Join all strings with a comma separator.
public class JoiningString {
    public static void main(String[] args) {
        
        List<String> strlist = Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten");
        System.out.println(strlist);
        
        String newstr = strlist.stream()
                    .collect(Collectors.joining(","));

                    System.out.println(newstr);
    }
}
