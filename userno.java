
//program to get input from user as number

import java.util.Scanner;

public class userno {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = s.nextInt();
        System.out.println("You Entered: "+num);
        s.close();

    }
}
