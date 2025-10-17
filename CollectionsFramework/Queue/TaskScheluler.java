package CollectionsFramework.Queue;
import java.util.*;

// Implement a simple Task Scheduler using Queue → add tasks, process tasks in FIFO order.
public class TaskScheluler {
    public static void main(String[] args) {
        
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Wake Up at 5\"0 clock");
        tasks.add("Doing Exercises");
        tasks.add("Fresh Up and Study upto 8 '0 clock");
        tasks.add("Going to college at 9'0 clock");
        tasks.add("Tata Bye Bye Upto 4'0 clock.........");
        while(!tasks.isEmpty()){
            System.out.println("~ " +tasks.poll());
        }
    }
}
