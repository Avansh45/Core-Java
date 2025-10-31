package FunctionalInterfaces.PredicateFI;

import java.util.function.Predicate;

// 5️⃣ Use Predicate.isEqual() to test if a given name equals "Java".
public class EqualsMethod {
    public static void main(String[] args) {
        
        var str = "Java";
        
        Predicate<String> predicate = Predicate.isEqual("Java"); 
        System.out.println(predicate.test(str));
    }
}
