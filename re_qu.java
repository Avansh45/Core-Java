//program to find quotient and remainder
import java.util.Scanner;
public class re_qu {
    public static void main(String[] args) {
        
        Scanner r = new Scanner(System.in);
        System.out.print("Enter First Number:");
        
        int num1= r.nextInt();

        System.out.print("Enter Second Number:");
        int num2= r.nextInt();
        int quot = num1/num2;
        if(num2!=0)
        {
        System.out.println("The Quotient of entered number is :"+quot);
        }
        else
        {
            System.out.println("Cannot divisible by Zer0");
        }
        int rem = num1%num2;
       
        System.out.println("The Remainder of entered number is :"+rem);
        r.close();

    }
}
