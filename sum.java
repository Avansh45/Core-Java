// Java Program to Calculate the Sum of Natural Numbers
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a End Number:");
        int sum=0;
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            sum = sum+i;
        }
        System.out.println("Sum of "+num+" Natural Numbers is "+sum);
        sc.close();
    }
}
