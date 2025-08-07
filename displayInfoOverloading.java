package Methods;
import java.util.Scanner;
public class displayInfoOverloading {
    static void displayInfo(String name){
        System.out.println("Name: "+name);
    }
    static void displayInfo(String name, int age){
        System.out.println("Name: "+name+" Age: "+age);
    }
    static void displayInfo(String name, int age,double score){
        System.out.println("Name: "+name+" Age: "+age+" Score: "+score);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name =sc.nextLine();
        System.out.print("\nEnter your Age: ");
        int age =sc.nextInt();
        System.out.print("\nEnter the Score: ");
        double score =sc.nextDouble();
        System.out.println("\n---- Displaying Info ----");

        displayInfo(name);
        displayInfo(name,age);
        displayInfo(name,age,score);
        sc.close();
    }
}
