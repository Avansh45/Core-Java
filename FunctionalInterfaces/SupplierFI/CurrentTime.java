package FunctionalInterfaces.SupplierFI;

import java.time.LocalTime;
import java.util.function.Supplier;

// Create a Supplier that returns the current system time.
public class CurrentTime {
    public static void main(String[] args) {
        
        Supplier<LocalTime> time = () -> LocalTime.now();
        System.out.println(time.get());
    }
}
