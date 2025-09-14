package ArraysPractice.ThreeDimensional.Medium3D;

public class Medium_Q4 {
    public static void main(String[] args) {
        
        // Multiply corresponding elements of two 3D arrays (element-wise).
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
        boolean multiply =true ;
        int res[][][] =new int[array1.length][array1[0].length][array1[0][0].length];
            if((array1.length != array2.length) || 
            (array1[0].length != array2[0].length) || 
            (array1[0][0].length != array2[0][0].length)){
            multiply=false;

            // ****For using this code use break outer loop after every if statement for instantly exit to improve code's performance****
            //It can be used for jagged arrays
            // if(array1.length!=array2.length) multiply=false;
            // for (int i = 0; i < array1.length; i++) {
            //     if (array1[i].length != array2[i].length) multiply= false;
            //     for (int j = 0; j < array1[i].length; j++) {
            //         if (array1[i][j].length != array2[i][j].length) multiply= false;
            //     }
            // }
        }
        else{
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<array1[i].length;j++){
                    for(int k=0; k<array1[0][0].length; k++){
                        res[i][j][k] = array1[i][j][k] * array2[i][j][k];
                    }
                }
            }
        }
        if(multiply){
            System.out.println("Result Matrix :");
            for (int[][] x : res) {
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
            System.out.println("Multiplication Cannot be performed on these matrices !");
        }

    }
}
