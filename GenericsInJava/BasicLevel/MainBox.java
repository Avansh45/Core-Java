package GenericsInJava.BasicLevel;

// Create a generic class Box<T> that stores an object of any type.
// Add methods set(T value) and get().
// Test it with String, Integer, and Double.
class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}
public class MainBox {
    public static void main(String[] args) {
        
          Box<Integer> intBox = new Box<>();
        intBox.setValue(5000);
        System.out.println(intBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(25.24);
        System.out.println(doubleBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Anshu");
        System.out.println(stringBox.getValue());
    }
}
