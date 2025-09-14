package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q9 {
    public static void main(String[] args) {
        
        // 9. Convert a 2D matrix into a 1D array (flattening).
        int [][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        int maxcol = matrix[0][0];
        for(int[]a : matrix){
            if(a.length>maxcol){
                maxcol=a.length;
            }
        }
        int n=0;
        int[] array = new int[matrix.length*maxcol];
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                array[n++]=matrix[row][col];
            }
        }
        for(int newarr: array){
            System.out.print(newarr+" ");
        }
    }
}
