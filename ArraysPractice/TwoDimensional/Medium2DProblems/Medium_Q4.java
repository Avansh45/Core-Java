package ArraysPractice.TwoDimensional.Medium2DProblems;

public class Medium_Q4 {
    public static void main(String[] args) {
        
        // Find the largest element in each row of a matrix.
        int row, col;
        int[][] matrix = {
            {1, 28, 3, 4},
            {5, 66, 7, 8},
            {9, 10, 121, 12},
            {13, 14, 125, 16}
        };
        for(row=0; row<matrix.length;row++){
            int l=0;
            for(col=0;col<matrix[row].length;col++){
                if(matrix[row][col] > l)
                    l=matrix[row][col];
            }
            System.out.println("Max Element of Row "+(row+1)+" : "+l);
        }
        
    }
}
