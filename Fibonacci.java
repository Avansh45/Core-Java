// Java Program to Display Fibonacci Series
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sr.nextInt();
        int a=0,b=1;
        int fibo=0;
        for(int i = 1;i<=n;i++){
            System.out.print(a+" ");
            fibo = a+b; 
            a=b;
            b=fibo;
        }
        sr.close();
    }
}
