
// Java Program to Find the Largest Among Three Numbers
import java.util.Scanner;
public class largest_no {
    public static void main(String[] args) {
        
        Scanner as = new Scanner(System.in);
        System.out.print("Enter the value for a :");
        int a = as.nextInt();
        System.out.print("Enter the value for b :");
        int b = as.nextInt();
        System.out.print("Enter the value for c :");
        int c = as.nextInt();
        if((a>b)||(a>c)){
            System.out.print(a+" is Greater.");
        }
        else if(b>c){
            System.out.print(b+" is Greater.");
        }
        else{
            System.out.print(c+" is Greater.");
        }
        as.close();
    }
}
