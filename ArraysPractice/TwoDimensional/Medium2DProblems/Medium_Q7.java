package ArraysPractice.TwoDimensional.Medium2DProblems;

public class Medium_Q7 {
    public static void main(String[] args) {
        
        // Print the lower triangular matrix.
        int row, col;
        int[][] matrix = {
            {1, 4, 9, 6},
            {5, 3, 4, 4},
            {8, 9, 1, 4},
            {1, 1, 5, 6}
        };
        for(row=0;row<matrix.length;row++){
            for(col=0; col<matrix[row].length;col++){
                if(col>row){
                    matrix[row][col]=0;
                }
            }
        }
        for(int[]arr : matrix){
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
