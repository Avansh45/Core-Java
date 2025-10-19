package GenericsInJava.IntermediateLevel;

// Create a class Calculator<T extends Number> that performs:
// add(T a, T b)
// subtract(T a, T b)
// multiply(T a, T b)
// divide(T a, T b)
class Calculator<T extends Number>{
    
    public double add(T a, T b){
        
        return a.doubleValue()+(b.doubleValue());
    }
    public double subtract(T a, T b){
        
        return a.doubleValue()-b.doubleValue();
    }
    public double multiply(T a, T b){
        
        return a.doubleValue()*(b.doubleValue());
    }
    public double divide(T a, T b){
       if(b.doubleValue()==0) throw new ArithmeticException("Cannot didvide byt Zero !");
        return a.doubleValue()/(b.doubleValue());
    }
}
public class CustomCalulator {
    public static void main(String[] args) {
        
        Calculator<Double> num = new Calculator<>();
        System.out.println(num.divide(5.2,2.1));

    }
}

