package LambdaExpressions.BasicLambdaExpressionProblems;

// Create a lambda expression that prints Hello Message using the Runnable interface.
public class HelloMessage {
    public static void main(String[] args) {
        
        Runnable runnable = () -> System.out.println("Hello Message using Lambda Expression !");
        runnable.run();
    }
}
