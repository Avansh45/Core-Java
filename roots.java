import java.util.Scanner;

public class roots {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = s.nextDouble();
        System.out.print("Enter value for b: ");
        double b = s.nextDouble();
        System.out.print("Enter value for c: ");
        double c = s.nextDouble();
        double discriminent = b*b-4*a*c;
        double root1 , root2 ;
        if(discriminent>0){
            root1=(-b+Math.sqrt(discriminent))/(2*a);
            root2=(-b-Math.sqrt(discriminent))/(2*a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if(discriminent==0){
            root1=root2=(-b/(2*a));
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else if(discriminent<0){
            double real = (-b/(2*a));
            double imaginary =Math.sqrt(-discriminent)/(2*a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
        s.close();
    }
}
