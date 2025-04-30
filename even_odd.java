// Java Program to Check Whether a Number is Even or Odd

import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a = obj.nextInt();
        if(a%2==0){
            System.out.println("Entered Number is Even....");
        }
        else{
            System.out.println("Entered number is odd ....");
        }
        obj.close();
    }
}
