package ArraysPractice.ThreeDimensional.Easy3D;

public class Easy_Q6 {
    public static void main(String[] args) {
        
        // Print elements column-wise across layers.
        int[][][] arr ={
            {
                {205,405,705,505},
                {605,805,708,908}
            },
            {
                {504,708,506,407},
                {908,204,302,201}
            }
        };
                
        for(int c=0; c<arr[0][0].length; c++){
            for(int depth=0; depth<arr.length; depth++){
                for(int r=0; r<arr[0].length; r++){
                    System.out.print(arr[depth][r][c]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
