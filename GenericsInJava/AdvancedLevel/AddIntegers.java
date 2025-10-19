package GenericsInJava.AdvancedLevel;
import java.util.*;
// Write a method addIntegers(List<? super Integer> list) that adds some integers to the list and prints it.
public class AddIntegers {
    public static void addIntegers(List<? super Integer> list){
        list.add(23);
        list.add(56);
        list.add(87);
        list.add(58);
        System.out.println(list);
    }
    public static void main(String[] args) {
        
        List<Integer> intlist = new ArrayList<>();
        addIntegers(intlist);
        
        List<Object> objlist = new ArrayList<>();
        addIntegers(objlist);

        // List<Double> doublelist = new ArrayList<>();
        // addIntegers(doublelist);                         //Error

        List<Number> numberlist = new ArrayList<>();
        addIntegers(numberlist);
    }
}
