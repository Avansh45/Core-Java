package ArraysPractice.TwoDimensional.Medium2DProblems;
import java.util.Scanner;

public class Medium_Q3 {
    public static void main(String[] args){

        // Check if a square matrix is symmetric.
         Scanner s = new Scanner(System.in);
        int n, row, col;
        boolean isSymmetric=true;
        System.out.print("Enter the size of square matrix : ");
        n = s.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (row = 0; row < n; row++) {

            System.out.println("Enter values for row " + (row + 1) + ":");
            for (col = 0; col < n; col++)
            {
                matrix[row][col] = s.nextInt();
            }
        }
        outerloop:
        for (row=0;row<n;row++) {
            for(col=0;col<n ; col++){
                if(matrix[row][col]!= matrix[col][row]){
                    isSymmetric = false;
                    break outerloop;
                }
            }
        }

        if(isSymmetric) System.out.println("Entered square matrix is Symmetric !");
        else System.out.println("Entered square matrix is not Symmetric !");

    }
}