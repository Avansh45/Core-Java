// Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;

public class pos_neg {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double input=sc.nextDouble();
        if(input>0.0){
            System.out.println(input+" is Positive....");
        }
        else if(input<0.0){
            System.out.println(input+" is Neagtive");
        }
        else{
            System.out.println(input+" is Zero");
        }
        sc.close();

    }
}
