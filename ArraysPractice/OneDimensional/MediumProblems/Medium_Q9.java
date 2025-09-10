package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q9 {
    public static void main(String[] args) {
        
        // Find the missing number in an array containing numbers from 1 to n with one missing.
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,18,19,20,};
        int x=1;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]!=x){
                System.out.println("Missing Number: "+x);
                break;
            }
            x++;
            // System.out.println(x);
        }
    }
}
