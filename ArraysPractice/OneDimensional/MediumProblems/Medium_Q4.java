package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q4 {
    public static void main(String[] args) {
        
        // Delete an element from a given index in an array (shift elements left).
        int arr[] ={5,10,15,20,25,30,35};
        int index=2;
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;//Initialize the last element as zero
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
