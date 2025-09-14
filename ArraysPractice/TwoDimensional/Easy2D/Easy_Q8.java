package ArraysPractice.TwoDimensional.Easy2D;

// 8. Check whether two matrices are equal.

public class Easy_Q8 {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        boolean isEqual = true;
        if(matrixA.length!=matrixB.length){
            isEqual = false;
        }
        
        mainLoop:
        for(int row=0;row<matrixA.length;row++){
            for(int col =0; col<matrixA[row].length; col++){
                if(matrixA[row][col] != matrixB[row][col]){
                    isEqual =false;
                    break mainLoop;
                }
            }
        }
        if(isEqual){
            System.out.println("Given Matrices are Equal !");
        }
        else{
            System.out.println("Given Matrices are not Equal !");
        }
    }
}
