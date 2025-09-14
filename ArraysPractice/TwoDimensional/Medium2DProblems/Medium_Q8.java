package ArraysPractice.TwoDimensional.Medium2DProblems;
import java.util.Scanner;
public class Medium_Q8 {
    public static void main(String[] args) {
        
        // Add two matrices and print the result.
        Scanner s = new Scanner(System.in);
        int m, n, row, col;
        int Matrix1[][],Matrix2[][],resMatrix[][] ;
        System.out.print("Enter the no. of rows:");
        m=s.nextInt();
        System.out.print("\nEnter the no. of columns:");
        n=s.nextInt();
        Matrix1 = new int [m][n];
        System.out.println("Enter the values for "+m+" x "+n+"Matrix 1:");
        for(row=0;row<m;row++){
            System.out.println("Enter the values for row "+(row+1));
            for(col=0; col<n;col++){
                Matrix1[row][col] = s.nextInt();
            }
        }
        Matrix2 = new int [m][n];
        System.out.println("Enter the values for "+m+" x "+n+"Matrix 2:");
        for(row=0;row<m;row++){
            System.out.println("Enter the values for row "+(row+1));
            for(col=0; col<n;col++){
                Matrix2[row][col] = s.nextInt();
            }
        }
        resMatrix = new int[m][n];
        for(row=0;row<m;row++){

            for(col=0; col<n;col++){
                resMatrix[row][col] = Matrix1[row][col] + Matrix2[row][col]; 
            }
        }
        System.out.println("The Resultant Matrix is:");
        for(int[] arr: resMatrix){
            for (int ele : arr) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
