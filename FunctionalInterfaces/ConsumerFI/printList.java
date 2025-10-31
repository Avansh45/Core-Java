package FunctionalInterfaces.ConsumerFI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Use a Consumer with a list to print all names in uppercase.
public class printList {
    public static void main(String[] args) {
        
        List<String> nameList = Arrays.asList("Amit","Akay","Karan","Diljit","Amrit");

        Consumer<List<String>> printNames = list -> {
            for(String name : list){
                System.out.println(name.toUpperCase());
            }
        };
        printNames.accept(nameList);

        // Consumer<String> printList = n-> System.out.println(n);

        // nameList.forEach(printList);
    }
    
}
