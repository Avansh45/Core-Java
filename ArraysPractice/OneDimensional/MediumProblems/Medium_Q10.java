package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q10 {
    public static void main(String[] args) {
        
        // Merge two sorted arrays into a single sorted array.
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={9,10,15,20,25,30};
        int[] arr= new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i] ;
        }
        int n=arr1.length;
        for(int i=0;i<arr2.length;i++){
            arr[n]=arr2[i] ;
            n++;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
