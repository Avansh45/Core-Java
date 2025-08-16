
//program to add two numbers and numbers are entered by the user
import java.util.Scanner;
public class addno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a=sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b=sc.nextInt();
        
        int c =a+b;         //storing the addition of numbers into c

        System.out.println("Addition of Entered Two Numbers is : "+c);
        sc.close();
    }
}
