package CollectionsFramework.Map.LinkedHashMap;
import java.util.*;

// Find the first element with frequency = 2 in an array
public class FindFrequency {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);

        System.out.print("Enter the total number of elements : ");
        int n = o.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            
            numbers.add(o.nextInt());
        }
        o.close();
        LinkedHashMap<Integer,Integer> mapp = new LinkedHashMap<>();

        for(Integer z : numbers){
            mapp.put(z, mapp.getOrDefault(z,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mapp.entrySet()){
            if(entry.getValue() == 2){
                System.out.println("First element with Frequency 2 is : "+entry.getKey());
                return;
            }         
        }
        System.out.println("No Element found with Frequency 2 !");

    }
}
