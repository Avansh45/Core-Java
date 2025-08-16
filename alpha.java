
// Java Program to Check Whether a Character is Alphabet or Not
import java.util.Scanner;

public class alpha {
    public static void main(String[] args) {
        
        Scanner as=new Scanner(System.in);
        System.out.print("Enter a Character:");
        char ch = as.next().charAt(0);

        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        {
            System.out.println(ch+" is a Alphabet");
        }
        else
        {
            System.out.println(ch+" is not a Alphabet");
        }
        as.close();
    }
}
