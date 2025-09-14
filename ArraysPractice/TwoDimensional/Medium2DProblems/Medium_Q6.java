package ArraysPractice.TwoDimensional.Medium2DProblems;

public class Medium_Q6 {
    public static void main(String[] args) {

        //  Print the upper triangular matrix.
        int row, col;
        int [][] array={{1,5,2},
                      {5,7,8},
                      {85,25,8}
                    };
        for(row=1; row<array.length; row++){
            for(col=0; col<row; col++)
            {
                if(array[row][col] != 0)
                {
                        array[row][col] = 0;
                }
            }
        }
        for(int[]a : array){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}