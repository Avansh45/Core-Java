package ArraysPractice.ThreeDimensional.Medium3D;

public class Medium_Q3 {
    public static void main(String[] args) {
        
        // Add two 3D arrays (element-wise).
        int[][][] array1 = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        int[][][] array2 = {
            {
                {9, 8},
                {7, 6}
            },
            {
                {5, 4},
                {3, 2}
            }
        };

        int[][][] result = new int [array1.length][array1[0].length][array1[0][0].length];
        boolean addition = true;

        if((array1.length != array2.length) || 
            (array1[0].length != array2[0].length) || 
            (array1[0][0].length != array2[0][0].length)){
            addition=false;
        }
        else{
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<array1[i].length;j++){
                    for(int k=0; k<array1[0][0].length; k++){
                        result[i][j][k] = array1[i][j][k] + array2[i][j][k];
                    }
                }
            }
        }
        if(addition){
            System.out.println("Result Matrix :");
            for (int[][] x : result) {
                for (int[] y : x) {
                    for (int z : y) {
                        System.out.print(z+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Cannot add these matrices !");
        }
        
    }
}
