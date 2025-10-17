package CollectionsFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

// Implement Queue using LinkedList
public class QueueAsLinkedList {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(85);
        queue.add(12);
        queue.add(38);
        queue.add(48);
        queue.add(62);
        System.out.println(queue);
        System.out.println(queue.peek()); // Returns first element without removing from queue
        
        System.out.println(queue.add(8));
        System.out.println(queue.offer(8));
        System.out.println(queue);
        
        queue.clear();
        // System.out.println(queue.remove());  // Throws Exception because Queue is Empty
        System.out.println(queue.poll()); // No Exception --> Return null only
    }
}
