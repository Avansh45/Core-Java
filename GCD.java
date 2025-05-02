// Java Program to Find GCD of two Numbers
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        
        System.out.print("Enter FIrst Number: ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2=sc.nextInt();

        int g_c_d=1;
        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1%i==0&&n2%i==0){
                g_c_d = i;
            }
        }
        System.out.println("GCD of "+n1+" and "+n2+" = "+g_c_d);
        sc.close();
    }
}
