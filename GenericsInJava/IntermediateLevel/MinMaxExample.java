package GenericsInJava.IntermediateLevel;

// Create a generic interface MinMax<T extends Comparable<T>> with methods: T min(T[] arr) T max(T[] arr)
// Then implement it in a class and find min and max for an array of integers.

interface MinMax<T extends Comparable<T>>{
    T min(T[] arr);
    T max(T[] arr);
}

class MinimumMaximum<T extends Comparable<T>> implements MinMax<T>{
    public T min(T[] arr){
        if(arr == null || arr.length == 0) return null;
        T min = arr[0];
        for(T ele: arr){
            if(ele.compareTo(min)<0) min=ele;

        }
        return min;
    }

    @Override
    public T max(T[] arr){
        if(arr == null || arr.length ==0){
            return null;
        }
        T max = arr[0];
        for(T element : arr){
            if(element.compareTo(max)>0) max=element;
        }
        return max;
    }
}
public class MinMaxExample {
    public static void main(String[] args) {
        
        Integer[] intNums ={12,45,87,9,56,23,456};
        MinimumMaximum<Integer> nums = new MinimumMaximum<>();
        System.out.println("Maximum Value : "+nums.max(intNums));
        System.out.println("Minimum Value : "+nums.min(intNums));

    }
}
