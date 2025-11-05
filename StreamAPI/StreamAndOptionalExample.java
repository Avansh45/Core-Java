package StreamAPI;

import java.util.Arrays;
import java.util.Objects;

// You are given:
// String[] names = {"Alex", null, "Bharath", "Divya", null, "Asha"};
// Use Stream + Optional to:
// Skip null values
// Print all non-null names in uppercase
public class StreamAndOptionalExample {
    public static void main(String[] args) {
        
        String[] names = {"Alex", null, "Bharath", "Divya", null, "Asha"};
        Arrays.stream(names)
            .filter(Objects::nonNull)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
