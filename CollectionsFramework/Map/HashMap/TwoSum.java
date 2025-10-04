package CollectionsFramework.Map.HashMap;
import java.util.*;

// Two Sum Problem (LeetCode #1)
public class TwoSum {
    public static void main(String[] args) {
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length ; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){

                System.out.println("Target found at indicies : ["+map.get(difference)+","+ i+"]");
            }
            map.put(nums[i],i);
        }
    }
}
