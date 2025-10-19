package GenericsInJava.IntermediateLevel;

// Write a generic method compare(T a, T b) that: Returns true if both are equal.
// Works for all classes that implement Comparable<T> (e.g. String, Integer).


public class CompareGenerics {

    public static<T extends Comparable<T>> boolean compare(T a,T b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        return a.compareTo(b)==0;
    }
    public static void main(String[] args) {
    
        System.out.println(compare(2343,2343 ));
        System.out.println(compare("Avi","Abhi"));
        System.out.println(compare(true, true));
        System.out.println(compare(34.56,34.456));
    }
}