package CollectionsFramework.Map.LinkedHashMap;

import java.util.*;

// Find the first repeating character in a string
public class RepeatingChar {
    public static void main(String[] args) {
        
        String string = "Hi, I am Java Full Stack Developer";
        LinkedHashMap<Character,Integer>  hashmap = new LinkedHashMap<>();
        
        String string2 = string.replaceAll("\\s","").toLowerCase();
        for(Character c : string2.toCharArray()){
            hashmap.put(c, hashmap.getOrDefault(c,0)+1);

            if(hashmap.get(c) ==2){
                System.out.println("First Repeating Character : "+c);
                return;
            }
        }

        System.out.println("No Repeating Character !");
    }
}
