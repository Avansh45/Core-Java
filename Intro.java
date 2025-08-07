package Methods;
import java.util.Scanner;
public class Intro {

    //void method(no need of return )
    void Reminder(){
        System.out.println("Man, Please Study!");
    }
    //static int method(must have return value)
    /*   If we need to call the static method so we can call it simply without creating any object
         BUT if we need to call a method which is not static then we need to call with the use of object....
    */ 
    static int Multiplication(int u,int v){
        int w=u*v;
        return w;
    }
    static String greetUser(String x){
        System.out.println("Hello "+x+ ", How are You?");
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name =sc.nextLine();
        greetUser(name);
        Intro in=new Intro();
        in.Reminder();
        int a=5,b=7;
        int c=Multiplication(a,b);
        System.out.println(c);
        sc.close();
    }
}
