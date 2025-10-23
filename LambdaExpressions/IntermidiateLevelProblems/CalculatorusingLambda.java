package LambdaExpressions.IntermidiateLevelProblems;

// Use lambdas to perform basic arithmetic operations:
// Addition
// Subtraction
// Multiplication
// Division
// Each operation should be a lambda stored in a variable.

interface calculator{
    int calculate(int a, int b);
}
public class CalculatorusingLambda {
    public static void main(String[] args) {
        
        calculator addition =(x,y)-> x+y; 
        calculator subtraction =(x,y)-> x-y; 
        calculator multiply =(x,y)-> x*y; 
        calculator divide =(x,y)->{
           if(y==0){
            System.out.println("cannot divide by zero !");
            return -1;
           } 
           else
            return x/y;
        } ;

        System.out.println(addition.calculate(5,2));
        System.out.println(subtraction.calculate(5,2));
        System.out.println(multiply.calculate(5,2));
        System.out.println(divide.calculate(5,0));
    }
}
