package CollectionsFramework.List.LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorInJava {
    public static void main(String[] args) {
        
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Cherry");
        fruits.add("Mango");
        // System.out.println(fruits);

        ListIterator<String> Elements = fruits.listIterator();
        //Forward Traversal
        System.out.println("Forward Traversal:");
        while(Elements.hasNext()){
            System.out.println(Elements.next());
        }

        Elements = fruits.listIterator();
        // Modifying while Traversing
        while(Elements.hasNext()){
            String str = Elements.next();
            if(str.equals("Grapes")){
                Elements.set("Banana");
                Elements.add("Papaya");
            }
        }
        System.out.println("AFTER MODIFYING :");
        System.out.println(fruits);

        //Backward Traversal
        System.out.println("\nBackward Traversal:");
        while(Elements.hasPrevious()){
            System.out.println(Elements.previous());
        }

    }
}
