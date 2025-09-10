package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q2 {
     public static void main(String[] args) {
        
        // Find the length of an array without using the built-in length.
        int a[] ={10,9,8,7,6,5,4,3,2,1,0};
        int len = 0;
        for (int arr : a) {
            System.out.print(arr+" ");
            len++;
        }
        System.out.print("\nLength of the Array is "+len);
    }
}
