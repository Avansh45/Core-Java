
// Java Program to Find Factorial of a Number
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        
        Scanner ad= new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = ad.nextInt();
        int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
                
            }
        
        System.out.println("Factorial for given number is "+fact);
        ad.close();
    }
}
