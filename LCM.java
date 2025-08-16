
// Java Program to Find LCM of two Numbers
import java.util.Scanner;

public class LCM {
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
        //Lcm(a,b) = (a*b)/Hcf(a,b)
        int lcm =(n1*n2)/g_c_d;
        System.out.println(lcm);
        sc.close();
    }
}
