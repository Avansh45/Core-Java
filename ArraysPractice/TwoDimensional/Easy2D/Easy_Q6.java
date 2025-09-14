package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q6 {
    public static void main(String[] args) {
        
        // 6. Search for a given element in a 2D matrix.
        int [][] matrix = {{1,2,3,4,6,8},
                            {10,20,25,65,75,85}
                        };
        int target = 65;
        for(int row=0; row<matrix.length;row++){
            for(int col=0; col<matrix[row].length; col++){
                if(matrix[row][col] == target){
                    System.out.println("Element found at index: "+row+","+col);
                    return;
                }
            }
        }
    }
}
