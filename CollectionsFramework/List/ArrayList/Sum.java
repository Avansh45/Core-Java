package CollectionsFramework.List.ArrayList;
import java.util.ArrayList;

//Just a basic program of ArrayList return the size of list , find sum and average of the elements.
public class Sum {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(35);
        list1.add(78);
        list1.add(65);
        list1.add(50);
        list1.add(89);
        list1.add(87);
        list1.add(65);
        list1.add(45);
        list1.add(24);

        System.out.println("Size of List : "+list1.size());

        int sum = 0;
        for(int a: list1){
            sum+=a;
        }
        System.out.println("Sum : "+sum);
        Double avg = (double)sum/list1.size();
        System.out.println("Average : "+avg);
    }
}
