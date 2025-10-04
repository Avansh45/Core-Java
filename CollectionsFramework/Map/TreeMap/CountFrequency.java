package CollectionsFramework.Map.TreeMap;

import java.util.TreeMap;

// Count frequency of elements and print sorted by keys
public class CountFrequency {
    public static void main(String[] args) {
      
        int[] arr = {3,1,2,2,3,1,3};
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);


    }
}
