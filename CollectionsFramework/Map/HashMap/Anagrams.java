package CollectionsFramework.Map.HashMap;

import java.util.HashMap;

// Check if two strings are anagrams
public class Anagrams {
    public static void main(String[] args) {
        
        String str1 = "calhr7u";
        String str2 = "arluju7c";

        HashMap<Character,Integer> map = new HashMap<>();

        for(Character ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Character ch : str2.toCharArray()){

            if(!map.containsKey(ch)){
                System.out.println("false(Strings are not Anagrams)");
                return;
            }

            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) map.remove(ch);
        }

        if(map.isEmpty()){
            System.out.println("true(Strings are Anagrams)");
        }


    }
}
