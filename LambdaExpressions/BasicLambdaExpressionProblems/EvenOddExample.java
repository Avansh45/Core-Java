package LambdaExpressions.BasicLambdaExpressionProblems;

// Write a lambda that takes an integer and returns true if it’s even, otherwise false.

interface checkEven{
    boolean test(int n);
}
public class EvenOddExample {
    public static void main(String[] args) {
        
        checkEven check = (n) -> n%2==0 ;
        
        System.out.println(check.test(8));
    }
}
