package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q10 {
    public static void main(String[] args) {
        
        // 10. Convert a 1D array into a 2D matrix (row-major order).
        int[] arr = {1,2,3,4,5,6,7,8};
        int m=2,n=4,i=0;
        int[][] matrix=new int[m][n];
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                matrix[row][col] = arr[i++];
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
