package ArraysPractice.TwoDimensional.Easy2D;
import java.util.Scanner;
// 7. Check if a matrix is an identity matrix.

public class Easy_Q7 {

    static void printingOutput(boolean x){
        if(x) System.out.println("Yes, The entered matrix is identity matrix !");
        else System.out.println("No, The entered matrix is not a identity matrix !");
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of rows/columns:");
        int x=s.nextInt();
        int y=x;

        int[][] Matrix = new int[x][y];
        for(int row=0;row<Matrix.length;row++){
            System.out.print("Enter Values for row "+row+" :-> ");
            for(int col=0;col<Matrix[row].length;col++){
                System.out.print("\nEnter value for index "+row+","+col+" :");
                Matrix[row][col]=s.nextInt();
            }
        }

        boolean isIdentityMatrix = true;
        outerloop:
        for(int row=0;row<Matrix.length;row++){
            for(int col=0;col<Matrix[row].length;col++){
                if(row==col){
                    if(Matrix[row][col]!=1){
                        isIdentityMatrix=false;
                        break outerloop;
                    }
                }
                else{
                    if(Matrix[row][col]!=0){
                        isIdentityMatrix=false;
                        break outerloop;
                    }
                }
            }
        }
        printingOutput(isIdentityMatrix);
        s.close();
    }
}
