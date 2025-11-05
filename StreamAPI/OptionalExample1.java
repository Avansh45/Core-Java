package StreamAPI;

import java.util.Optional;;
// Q1. Create an Optional<String> method containing a name.
// If the name is present, print it in uppercase using ifPresent().
// If it’s not present, print "Name not available" using orElse().
public class OptionalExample1 {
    public static void main(String[] args) {
        
        Optional<String> name = getName();
        // name.ifPresent(x -> System.out.println(x.toUpperCase()));
        // System.out.println(name.orElse("Name not available"));

        System.out.println(name.map(String::toUpperCase).orElse("Name not available"));
    }
    private static Optional<String> getName(){
        return Optional.ofNullable("Avansh");
    }
}
