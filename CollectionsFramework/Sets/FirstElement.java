package CollectionsFramework.Sets;

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Iterator;

// Given an array of integers or strings , find the first element that occurs only once using Set.
public class FirstElement{
    public static void main(String[] args) {
        
        String[] fruits = {"Orange", "Apple", "Banana", "Mango",  "Banana", "Apple", "Grapes", "Mango"};


        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(fruits));
        for(String strs : fruits){
            set.add(strs);
        }

        Iterator<String> it = set.iterator();
        if(it.hasNext()){
            System.out.println("First Element : "+it.next());
        }
        else{
            System.out.println("Set is Empty !");
        }
        
    }
}