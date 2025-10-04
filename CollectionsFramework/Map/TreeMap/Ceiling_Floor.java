package CollectionsFramework.Map.TreeMap;

import java.util.*;

public class Ceiling_Floor {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(65, "A");
        map.put(105, "B");
        map.put(50, "C");

        System.out.println("Ceiling of 15: " + map.ceilingKey(15));
        System.out.println("Floor of 15: " + map.floorKey(15));
        
        System.out.println("Ceiling Entry of 15: " + map.ceilingEntry(15));
        System.out.println("Floor Entry of 15: " + map.floorEntry(15));
    }
}
