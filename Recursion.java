package Methods;

public class Recursion {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }



    static void fibonacci(int n){
        int a=0,b=1,r=1;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++){

            r=a+b;
            System.out.print(r+" ");
            a=b;
            b=r;
            
        }
    }
    public static void main(String[] args) {
        int x=8;
        System.out.println("The Factorial of x is :"+factorial(x));
        fibonacci(x);
    }
}
