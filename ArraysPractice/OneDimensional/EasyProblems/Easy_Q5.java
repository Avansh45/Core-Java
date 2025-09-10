package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q5 {
    public static void main(String[] args) {
        // Find the maximum and minimum element in a 1D array.
        int []arr={55,52,8,7,9,52,86,45,78,5};
        int min=arr[0];
        int max=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        System.out.println("Minimum Element: "+min);
        System.out.println("Maximum Element: "+max);
    }
}

