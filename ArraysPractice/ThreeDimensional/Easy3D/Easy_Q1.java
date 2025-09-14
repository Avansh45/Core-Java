package ArraysPractice.ThreeDimensional.Easy3D;

public class Easy_Q1 {
    public static void main(String[] args) {

        // Print all elements of a 3D array.
        int [][][] array = {
            {
                {11,12,13},
                {21,22,23}
            },
            {
                {1,2,3},
                {4,5,6}
            }
    };
        int i, j, k;
        for(i=0;i<array.length;i++){
            System.out.println("No. "+(1+i)+"  2d");
            for(j=0;j<array[i].length;j++){
                for(k=0;k<array[i][j].length;k++){
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
