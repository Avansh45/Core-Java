package FunctionalInterfaces.SupplierFI;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.Random;

public class RandomEvenTest {
    public static void main(String[] args) {

        Random random = new Random();

        
        Supplier<Integer> randomNumber = () -> random.nextInt(100);

        
        Predicate<Integer> isEven = n -> n % 2 == 0;

        
        for (int i = 1; i <=5; i++) {
            int num = randomNumber.get();
            System.out.println("Random number: " + num + " ---- Is even? " + isEven.test(num));
        }
    }
}
