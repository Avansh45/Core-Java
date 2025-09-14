package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q2 {
    public static void main(String[] args) {
        
        // 2. Find the sum of all elements in a 2D array.
        int [][] arr = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);

        //Another way
        // for(int[] x:arr){
        //     for(int j:x){
        //         sum+=j;
        //     }
        // }
        // System.out.println(sum);
    }
}
