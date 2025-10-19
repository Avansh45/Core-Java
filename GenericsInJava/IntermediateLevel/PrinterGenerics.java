package GenericsInJava.IntermediateLevel;

import java.util.Arrays;
import java.util.List;

// Create a class Printer<T> that takes a list of elements and prints only if the element type is Number (use bounded generics).
class Printer<T extends Number>{

    void print(List<T> list){
        System.out.println("Array List : ");
        for(T element : list){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
public class PrinterGenerics {
    public static void main(String[] args) {
        
        Printer<Integer> intList = new Printer<>();
        intList.print(Arrays.asList(21,45,87,45,45,21));

        // Printer<String> strList = new Printer<>();
        Printer<Double> doubleList = new Printer<>();
        doubleList.print(Arrays.asList(21.7,45.6,87.8,56.8,56.2,875.3));
    }
}
