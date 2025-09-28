package CollectionsFramework.List.ArrayList;
import java.util.ArrayList;
// Problem 5 — Remove duplicates
// Create an ArrayList<Integer> with some duplicate elements.
// Remove duplicates without using Set (loop through list manually).
// Print original list and list after removing duplicates.
class RemoveDuplicates{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(14);
        list.add(10);
        list.add(62);
        list.add(10);
        list.add(68);
        list.add(25);
        list.add(25);

        System.out.println("Original List : "+list);
        ArrayList<Integer> checklist = new ArrayList<>();
        for (Integer integer : list) {
            if(!checklist.contains(integer)){
                checklist.add(integer);
            }
        }
        System.out.println("List After Removing Duplicates : "+checklist);
    }
}