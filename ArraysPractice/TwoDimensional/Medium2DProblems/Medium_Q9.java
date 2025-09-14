package ArraysPractice.TwoDimensional.Medium2DProblems;

public class Medium_Q9 {
    public static void main(String[] args) {
        
        // Multiply two matrices and print the result. 
        int col, row, k;
        int[][] MatrixA = {
            {2, 4, 1},
            {0, -1, 3}
        };

        int[][] MatrixB = {
            {1, 5},
            {2, 0},
            {-3, 4}
        };
        int[][] result = new int [MatrixA.length][MatrixB[0].length];
        for(row=0; row<MatrixA.length;row++){
            for(col=0; col< MatrixB[0].length;col++){
                int r=0;
                for(k=0; k<MatrixB.length;k++){
                    r+=MatrixA[row][k]*MatrixB[k][col];
                }
                result[row][col]=r;
            }
        }
        System.out.println("Resultant matrix: ");
        for (int[] res : result) {
            for(int x : res){
                System.out.print(x+"\t");
            }
            System.out.println();
        }
    }
}
