package LambdaExpressions.IntermidiateLevelProblems;
import java.util.*;
// Given a list of integers, use a lambda and forEach() to print their squares.

public class SquareOfNums {
    public static void main(String[] args){

        List<Integer> numberlist = new ArrayList<>();
        for(int i=0;i<=10;i++){
            numberlist.add(i+3);
        }
        System.out.println(numberlist);
        numberlist.forEach(n-> System.out.print(" "+(n*n)));
    }    
}
