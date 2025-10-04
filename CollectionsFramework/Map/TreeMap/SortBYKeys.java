package CollectionsFramework.Map.TreeMap;

import java.util.TreeMap;

// Store student names with marks and print sorted by student name
public class SortBYKeys {
    public static void main(String[] args) {
        
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Anshu",98);
        map.put("Sumit",75);
        map.put("Avika",86);
        map.put("Amit",80);
        map.put("Amrit",89);

        System.out.println(map);
    }
}
