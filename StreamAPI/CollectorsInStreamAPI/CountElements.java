package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Count how many elements are in a list of integers.
public class CountElements {
    public static void main(String[] args) {
        
        List<Integer> numlist = Arrays.asList(21,45,56,85,45,21,56);
        List<String> namelist = Arrays.asList("Amit","Sumit","Dakshit","Rahul");


        Long intcount = numlist.stream()
            .collect(Collectors.counting());

            System.out.println(intcount);


        Long strcount = namelist.stream()
            .collect(Collectors.counting());

            System.out.println(strcount);

    }
}
