package FunctionalInterfaces.SupplierFI;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

// Combine Supplier + Consumer — generate a string and print it.

public class RandomString {
    public static void main(String[] args) {
        
        Random random = new Random();
        String allText = "ABCDEFGHJKLMNOPQRSTUVWXYZavcdefghijklmnopqrstuvwxyz0123456789";
        int length =10; //Length of Generating random String
        Supplier<String> randomString = () -> {
            
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<length;i++){

                int randomNum = random.nextInt(10);
                sb.append(allText.charAt(randomNum));
            }
            return sb.toString();
        };
        Consumer<String> consumer = str -> System.out.println(str);

        consumer.accept(randomString.get());
    }
}
