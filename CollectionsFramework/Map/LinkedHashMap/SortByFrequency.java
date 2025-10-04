package CollectionsFramework.Map.LinkedHashMap;
import java.util.*;

// Sort elements by frequency and preserve insertion order
public class SortByFrequency {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total number of elements : ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scan.nextInt();
        }
        LinkedHashMap<Integer,Integer> freqmap = new LinkedHashMap<>();
        for(int a : nums){
            freqmap.put(a,freqmap.getOrDefault(a,0)+1);
        }

        List<Map.Entry<Integer,Integer>> e = new ArrayList<>(freqmap.entrySet());
        e.sort((a,b)-> b.getValue().compareTo(a.getValue()));

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : e){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap);
        scan.close();
    }
}
