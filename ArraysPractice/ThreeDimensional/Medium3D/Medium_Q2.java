package ArraysPractice.ThreeDimensional.Medium3D;

public class Medium_Q2 {
    public static void checkingEqual(boolean x){
        if(x==true){
            System.out.println("Both the Matrices are equal !");
        }
        else{
            System.out.println("Matrices are not equal !");
        }
    }
    public static void main(String[] args) {
        
        // Check whether two 3D arrays are equal.
        int[][][] array1 = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        int[][][] array2 = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };
        boolean isEqual = true;
        if(array1.length != array2.length){
            isEqual =false;
        }
        else{
            mainLoop:
            for(int i=0; i<array1.length; i++){
                for(int j=0; j<array1[i].length; j++){
                    for(int k=0; k<array1[i][j].length; k++){
                        if(array1[i][j][k] != array2[i][j][k]){
                            isEqual = false;
                            break mainLoop;
                        }
                    }
                }
            }
        }
        checkingEqual(isEqual);
    }
}
