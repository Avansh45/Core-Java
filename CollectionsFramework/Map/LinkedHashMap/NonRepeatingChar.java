package CollectionsFramework.Map.LinkedHashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

// Find the first non-repeating character in a string
public class NonRepeatingChar {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String to find the first non repeating Character : ");
        String str = s.nextLine();
        String newstr =  str.replaceAll("\\s","").toLowerCase();
        s.close();
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch : newstr.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()==1){
                System.out.println("First Non-Repeating Character is : "+e.getKey());
                return;
            }
        }
        System.out.println("No Non-Repeating Character Found !");
        
    }
}
