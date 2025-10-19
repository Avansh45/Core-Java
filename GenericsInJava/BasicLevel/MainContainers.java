package GenericsInJava.BasicLevel;

// Create a generic class Container<T> that has a method to check if two containers have equal values.
class Container<T>{

    T value;

    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }
    
    boolean isEqual(Container<T> that){
        if((this.value).equals(that.value)){
            return true;
        }
        else return false;
    }


}
public class MainContainers {
    public static void main(String[] args) {
        
        Container<Integer> intContainer1 = new Container<>();
        intContainer1.setValue(87);
        Container<Integer> intContainer2 = new Container<>();
        intContainer2.setValue(871);

        System.out.println(intContainer1.isEqual(intContainer2));
    }
}
