package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q4 {
    public static void main(String[] args) {
        
        // 4. Find the sum of each row in a 2D array.
        int[][] array = {{10,20,30,40},
        {1,5,6,2,8},
        {7,7,6,2,8}};
        int arrnum=1;
        for(int[] arr:array){
            int sum=0;
            for(int a:arr){
                sum+=a;
            }
            System.out.println("Sum of "+arrnum+++" array: "+sum);
        }
    }
}
