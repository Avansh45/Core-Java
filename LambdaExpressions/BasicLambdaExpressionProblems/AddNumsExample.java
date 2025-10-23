package LambdaExpressions.BasicLambdaExpressionProblems;

// Use your own interface with one method int add(int a, int b) and call it using a lambda expression.
@FunctionalInterface
interface AddNums {

    int add(int a, int b);
}
public class AddNumsExample {
    public static void main(String[] args) {
        
        AddNums addition = (a,b) -> a+b;
        System.out.println(addition.add(51,21));
    }
}
