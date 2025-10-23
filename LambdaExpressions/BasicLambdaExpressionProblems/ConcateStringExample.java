package LambdaExpressions.BasicLambdaExpressionProblems;

// Write a lambda that accepts two strings and returns their concatenation.
interface concatenateStrings{
    String concate(String str1, String str2);
}
public class ConcateStringExample {
    public static void main(String[] args) {
        
        concatenateStrings concateStr = (s1,s2) -> s1+s2;
        System.out.println(concateStr.concate("Java ", " Developer")); 
    }
}
