package CollectionsFramework.List.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        
        // Create a LinkedList of integers. Ask the user for a number.
        //  If the number exists, print its index using indexOf(). Otherwise print “Not Found.”
          LinkedList<Integer> list = new LinkedList<>();
        list.offer(58);
        list.offer(92);
        list.offer(21);
        list.offer(35);
        list.offer(68);

        System.out.println("Enter the Number :");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(list.contains(n)){
            System.out.println(list.indexOf(n));
        }
        else{
            System.out.println("Not Found !");
        }
        s.close();
    }
}
