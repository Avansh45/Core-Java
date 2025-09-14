package ArraysPractice.ThreeDimensional.Medium3D;

public class Medium_Q1 {
    public static void main(String[] args) {
        
        //  Convert a 3D array into a 1D array (flatten it).
        int[][][] array = {
            {{25,26,27},{75,76,77},
            {15,16,17,18},{55,56,57}}
        };
        int TotalSize=0;
        for(int i=0;i<array.length; i++){
            for(int j=0; j<array[0].length;j++){
                TotalSize += array[i][j].length;
            }
        }
        int[] arr1D = new int[TotalSize];
        int ind =0;
        for(int i=0;i<array.length;i++){
            for(int j=0; j<array[i].length; j++){
                for(int k=0; k<array[i][j].length;k++){
                    arr1D[ind]=array[i][j][k];
                    ind++;
                }
            }
        }
        System.out.print("Flattened 1D Array : ");
            for(int ele:arr1D){
                System.out.print(ele+" ");
            }
    }
}
