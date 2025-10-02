package CollectionsFramework.List.LinkedList;
import java.util.LinkedList;
public class QueueStyle {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(25);
        list.offer(48);
        list.offer(14);
        list.offer(35);
        list.offer(87);

        System.out.println(list);
        list.offerFirst(11);
        list.offerLast(99);

        // Check the head task using peek().
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        //  Remove (dequeue) two tasks using poll() and print the queue after each step.
        System.out.println(list.poll());
        System.out.println(list);
    }
}
