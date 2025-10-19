package GenericsInJava.BasicLevel;

// Write a class Pair<K, V> that stores a key-value pair (like a mini map entry).
// Add a method displayPair() to print key and value.

class Pair<K,V>{
    private K key;
    private V value;
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
    
    public void displayPair(){
        System.out.println("Key->"+key+", Value->"+value);
    }
}
public class PairsUsingGenerics {
    public static void main(String[] args) {
        
        Pair<Integer,String> serialNums = new Pair<>();
        serialNums.setKey(85);
        serialNums.setValue("Anshu");
        serialNums.displayPair();


        Pair<String,Integer> StudentMarks = new Pair<>();
        StudentMarks.setKey("Amit");
        StudentMarks.setValue(86);
        StudentMarks.displayPair();
    }
}
