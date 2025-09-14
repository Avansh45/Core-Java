package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q3 {
    public static void main(String[] args) {
        
        // 3. Find the maximum and minimum element in a 2D array.
        int [][] a = {
            {1,5,3,6,5,5},
            {8,45,12,78,55,45},
            {25,14,65,35,45,78,45}
        };
        int max = a[0][0];
        int min = a[0][0];
        for(int[] i:a){
            for(int j : i){
                max = Math.max(max,j);
                min = Math.min(min,j);

            }
        }
        System.out.println("Minimum Element: "+min + "\nMaximum Element: "+max);
    }
}
