

package ArraysPractice.TwoDimensional.Medium2DProblems;

public class Medium_Q1 {
    public static void main(String[] args) {
        
        // ********* Program to Print the transpose of a matrix.*********
        //This Program will work for jagged arrays also and prints if there is no value on particular index
        int col , row, colMaxLen=0;
        int[][] arr = {
            {1,2,3},
            {4,8},
            {7,16}
        };
        
        for(int []a: arr){
            if(a.length>colMaxLen){
                colMaxLen=a.length;
            }
        }
        for(col=0; col<colMaxLen; col++){
            for(row=0; row<arr.length; row++ ){
                if(col<arr[row].length){
                    System.out.print(arr[row][col]+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

    }
}
