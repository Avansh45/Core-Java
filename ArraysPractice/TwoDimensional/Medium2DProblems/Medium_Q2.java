package ArraysPractice.TwoDimensional.Medium2DProblems;
import java.util.Scanner;
public class Medium_Q2 {
    public static void main(String[] args) {
        
        //  Calculate the sum of diagonal elements (primary and secondary).
        int n,row,col;
        int Primary_Sum=0;
        int Secondary_Sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows/columns for square Matrix: ");
        n = sc.nextInt();
        int [][] Matrix = new int [n][n];
        System.out.println("Enter the Values for Matrix");
        for(row=0; row<n; row++)
        {
            System.out.println("Enter Values for row: "+(row+1));
            for(col=0; col<n;col++)
            {
                Matrix[row][col]=sc.nextInt();
            }
        }

        for(row=0; row<n; row++){
            for(col=0; col<n;col++)
            {
                if(row==col)
                {
                    Primary_Sum+=Matrix[row][col];
                }
            }
        }

        for(row=0; row<n; row++)
        {
            Secondary_Sum+=Matrix[row][Matrix[row].length-1-row];
        }
        System.out.println("Sum of Primary Diagonal Elements: "+Primary_Sum);
        System.out.println("Sum of Secondary Diagonal Elements: "+Secondary_Sum);
        sc.close();
    }
}
