package CollectionsFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

// Find all duplicates in an array
public class Duplicates {
    public static void main(String[] args) {
        
        int[] arr = {2,1,85,5,3,6,8,7,5,4,5,6,9,8,85,71,7,9,};

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(Integer value : arr){
            hash.put(value, hash.getOrDefault(value,0)+1);
        }

        for(Map.Entry<Integer,Integer> num : hash.entrySet()){
            if(num.getValue()>1){
                System.out.println("Duplicate : "+num.getKey());
            }
        }


    }
}
