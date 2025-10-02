package CollectionsFramework.List.LinkedList;
import java.util.LinkedList;
public class DequeStyle {
    public static void main(String[] args) {
        
        LinkedList<String> strs = new LinkedList<>();
        strs.add("Aditya");
        strs.add("Shreya");
        strs.add("Adhi");
        strs.add("pari");
        strs.add("Aarush");
        strs.add("Avika");
        System.out.println(strs);

        // Create a LinkedList of strings. Add one element at the start and one at the end. Print the list.

        strs.addFirst("AVANSH");
        System.out.println(strs);

        strs.addLast("ANSHU");
        System.out.println(strs);

        // Remove the first and last elements from the LinkedList. Then remove the element at index 2. Print the list after each operation.
        strs.removeFirst();
        System.out.println(strs);

        strs.removeLast();
        System.out.println(strs);
    }
}
