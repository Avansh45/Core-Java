package CollectionsFramework.Map.HashMap;

import java.util.HashMap;

// Count frequency of words in a sentence
public class WordsFrequency {
    public static void main(String[] args) {
        
        String str = "this is the simple sentence this is separated by spaces";

        HashMap<String,Integer> hashmap = new HashMap<>();
        String[] str1 = str.split(" ");

        for(String word: str1){
            hashmap.put(word, hashmap.getOrDefault(word,0)+1);
        }
        System.out.println(hashmap);
    }
}
