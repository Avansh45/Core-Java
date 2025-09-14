package ArraysPractice.TwoDimensional.Medium2DProblems;

public class Medium_Q5 {
    public static void main(String[] args) {
        
        //  Find the smallest element in each column of a matrix.
        int row, col, maxColLen=0;
        int[][] matrix = {
            {1, 42, 9, 16},
            {25, 36, 49, 64},
            {81, 100, 121, 144},
            {169, 16, 225, 256}
        };
        for(int[] a: matrix){
            if(a.length>maxColLen){
                maxColLen = a.length;
            }
        }
        for(col=0; col<maxColLen; col++){
            int S = Integer.MAX_VALUE;
            for(row=0;row<matrix.length;row++){
                if(col<matrix[row].length){     //Will work for jagged arrays too
                    if(matrix[row][col] < S){
                        S = matrix[row][col];
                    }
                    
                }
                
            }
            System.out.println("Smallest Element in Column "+(col+1)+" : "+S);
        }
    }
}
