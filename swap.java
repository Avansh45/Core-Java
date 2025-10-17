
// Java Program to Swap Two Numbers

import java.util.Scanner;
class swap{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int input1 = sc.nextInt();

        System.out.print("Enter 2nd Number:");
        int input2 = sc.nextInt();

        System.out.println("Before Swapping.... Ist Number is "+input1+" and 2nd number is "+input2+".\n");

        int temp=input1;
        input1= input2;
        input2 = temp;


        System.out.println("After Swapping.... Ist Number is "+input1+" and 2nd number is "+input2+".");
        sc.close();

    }
}