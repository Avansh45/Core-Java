package LambdaExpressions.BasicLambdaExpressionProblems;

// Create a lambda that takes a string and returns its length.
interface findStrLength{
    int strLength(String string);
}
public class StringExample {
    public static void main(String[] args) {
        
        findStrLength  Length = (str) -> str.length();

        System.out.println(Length.strLength("Java Programming !"));
    }
}

