package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q1 {
    public static void main(String[] args) {

        
        // 1. Print all elements of a 2D array in row-wise and column-wise order.
        int [][] arr = {
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
