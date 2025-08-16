
// Java Program to Generate Multiplication Table
import java.util.Scanner;
public class Mul_Table {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Enter the number upto which you want Table of "+n);
        int num = sc.nextInt();

        System.out.println("Multiplication Table of "+n);

        for(int i=1;i<=num;i++){
            int mul = n*i;
            System.out.println(n+" * "+i+ " = "+mul);
        }
        sc.close();
    }
}
