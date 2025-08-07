import java.util.Scanner;


class Car{

    public void startEngine(){
        System.out.println("Engine started");
    }
    public void drive(){
        System.out.println("Car is Moving");
    }
    public void stoptEngine(){
        System.out.println("Engine stopped");
    }

}



class Calculator{
    public int add(int a,int b){
        System.out.print("Addition of two numbers :");
        return a+b;
    }
    public int substract(int a,int b){
        System.out.print("Subtraction of two numbers :");
        return a-b;
    }

    public int multiply(int a,int b){
        System.out.print("Multiplication of two numbers :");
        return a*b;
    }
    public int divide(int a,int b){
        if(b!=0){
            System.out.print("The Division of two numbers: ");
            return a/b;
        }
        else{
            System.out.print("Cannot divide by zero");
            return 0;
        }
    }

}
public class Classses {
    public static void main(String[] args) {
        
        // Car CarTest = new Car();
        // CarTest.startEngine();
        // CarTest.drive();
        // CarTest.stoptEngine();

        Calculator CalculatorTest = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(CalculatorTest.add(x, y));
        System.out.println(CalculatorTest.substract(x, y));
        System.out.println(CalculatorTest.multiply(x, y));
        System.out.println(CalculatorTest.divide(x, y));
        sc.close();

    }
}
