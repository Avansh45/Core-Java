package Methods;


public class MethodOverloading {

    //Addition of  two three and four numbers using method overloading

    static int Add(int a,int b){ //Here a and b are parameters
        return a+b;
    }
    static int Add(int a,int b,int c){
        return a+b+c;
    }
    static int Add(int a,int b,int c,int d){
        return a+b+c+d;
    }




    // multiply(int a, int b) – multiplies two integers
    static void multiply(int a1, int b1){
        System.out.println("Multiplication of two  Integer numbers : "+(a1*b1));
    }

    //multiply(double a, double b) – multiplies two double values
    static void multiply(double a2, double b2){
        System.out.println("Multiplication of two double numbers : "+(a2*b2));
    }

    // multiply(int a, int b, int c) – multiplies three integers
    static void multiply(int a3,int b3,int c3){
        System.out.println("Multiplication of  three Integers numbers : "+(a3*b3*c3));
    }

    public static void main(String[] args) {

        //Calling of addition methods
        System.out.println("Addition of two numbers: "+Add(2,3));//Here a and b are arguments
        System.out.println("Addition of three numbers: "+Add(2,5,6));//Arguments are Actual
        System.out.println("Addition of four numbers: "+Add(2,5,6,7));

        System.out.println("    ************************************    ");
        //Calling of multiplication methods

        multiply(5,6);
        multiply(5.0,65.0);
        multiply(3,5,7);

    }
        
}
