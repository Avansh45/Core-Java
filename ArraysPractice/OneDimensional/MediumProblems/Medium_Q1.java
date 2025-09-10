package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q1 {
    public static void main(String[] args) {
        
        // Move all zeros to the end while maintaining order of non-zero elements.

        int arr[] = {2,6,8,0,4,1,0,8,7,0,5,6,4,0,1,5,5,40,4,8,10};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
}
