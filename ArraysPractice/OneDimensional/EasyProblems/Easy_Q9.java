package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q9 {
    public static void main(String[] args) {
        
        // Count the number of even and odd numbers in an array.
        int arr[] ={5,6,8,6,9,8,8,79,6,79,47,96,4,5,6,45,65,5,56,87};
        int even=0, odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Total Even numbers in array : "+even);
        System.out.println("Total Odd numbers in array : "+odd);
    }
}
