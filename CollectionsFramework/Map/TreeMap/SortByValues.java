package CollectionsFramework.Map.TreeMap;

import java.util.*;

// Sort a map by values
public class SortByValues {
    public static void main(String[] args) {
        
        TreeMap<String,Integer> sortedmap = new TreeMap<>();
        sortedmap.put("Arvind",55);
        sortedmap.put("Aditya",68);
        sortedmap.put("Narinder",87);
        sortedmap.put("Anshu",96);
        sortedmap.put("Avika",74);

        System.out.println("Original Map : "+sortedmap);

        List<Map.Entry<String,Integer>> entry  = new ArrayList<>(sortedmap.entrySet());
        entry.sort(Map.Entry.comparingByValue());

        System.out.println("\nAfter Sorting the Elements by values : ");
        for(Map.Entry<String,Integer> e : entry){
            System.out.println(e.getKey()+" : "+ e.getValue());
        }


    }
}
