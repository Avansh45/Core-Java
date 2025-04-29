//program to find ascii values
import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char c = scan.next().charAt(0);
        int ascii_val = (int) c ;
        System.out.println("Ascii Value of "+c+" is "+ascii_val);
        scan.close();
    }
}
