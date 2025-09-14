package ArraysPractice.ThreeDimensional.Easy3D;

public class Easy_Q3 {
    public static void main(String[] args) {
        
        // 3. Find the maximum and minimum element in a 3D array.
        int i, j, k;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[][][] arr ={
            {{25,45,75},{65,85,78,98}},
            {{54,78,56,47},{98,24,32}}
        };
        for(i=0;i<arr.length;i++){
            for(j=0; j<arr[i].length; j++){
                for(k=0; k<arr[i][j].length; k++){
                    if(arr[i][j][k]>max){
                        max=arr[i][j][k];
                    }
                    if(arr[i][j][k]<min){
                        min=arr[i][j][k];
                    }
                }
            }
        }
        System.out.println("Minimum Value in array : "+min+"\nMaximum Value in array : "+max);
    }
}
