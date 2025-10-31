package FunctionalInterfaces.SupplierFI;

import java.util.Random;
import java.util.function.Supplier;

// Create a Supplier that generates a random number.
public class RandomNumber {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Supplier<Integer> randNum = () -> rand.nextInt(120);

        System.out.println("Some Random Numbers are :");
        for (int i=1;i<=8;i++) {
            System.out.println(randNum.get());
        }
    }
    
}
