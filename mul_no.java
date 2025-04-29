//program to multiply two float values
import java.util.Scanner;

public class mul_no {
    public static void main(String[] args) {
        
        Scanner ss =new Scanner(System.in);

        System.out.print("Enter First Float Number: ");
        float x=ss.nextFloat();

        System.out.print("Enter Second Float Number: ");
        float y=ss.nextFloat();

        float result = x*y;
        System.out.println("The MUltiplication of entered two Float numbers is : "+result);

        ss.close();
    }
}
