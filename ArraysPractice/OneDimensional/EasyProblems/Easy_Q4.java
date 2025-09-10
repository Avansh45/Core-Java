package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q4 {
    public static void main(String[] args) {
        
        // Find the average of elements in a numeric array.
        int nums[] = {25,55,15,54,62};
        int sum=0;
        System.out.print("Original Array: ");
        for (int arr : nums) {
            System.out.print(arr+" ");
            sum+=arr;
        }
        float avg =sum/nums.length;
        System.out.println("\nAverage of the elements: "+avg);
    }
}
