package CollectionsFramework.Map.HashMap;
import java.util.HashMap;

// Count frequency of characters in a string
public class CharFrequency {
    public static void main(String[] args) {
        
        String string = "avanshchadgal";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : string.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
