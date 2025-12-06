package StreamAPI.CollectorsInStreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

// Count frequency of each character in a string.
public class CountFreqOfChar {
    public static void main(String[] args) {
        
        String str = "Java is a Programming Language";
        char[] charList = str.replaceAll("\\s", "").toCharArray();

        Integer[] intList = new Integer[charList.length];
        int i=0;
        for(char ch : charList){
            intList[i++] = (int) ch;
        }

        Map<Character,Long> countingChar = Arrays.stream(intList)
                        .collect(Collectors
                        .groupingBy(c -> (char) (int) c,Collectors.counting()));
        System.out.println(countingChar);
    }
}
