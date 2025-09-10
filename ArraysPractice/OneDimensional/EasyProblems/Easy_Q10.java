package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q10 {
    public static void main(String[] args) {
        
        // Reverse a 1D array in place.
        int numbers[] = {0,2,4,6,8,10};
        System.out.print("Original Array: ");
        for (int nums : numbers) {
            System.out.print(nums+" ");
        }
        System.out.print("\nReversed Array: ");
        for(int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]+" ");
        }
    }
}
