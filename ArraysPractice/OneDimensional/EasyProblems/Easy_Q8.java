package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q8 {
    public static void main(String[] args) {
        
        // Find the index of the first occurrence of a target value in an array.
        int arr[]={56,84,89,75,45,21,45,23,56,87,9,95,845,87};
        int targetValue=45;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==targetValue) {
                index=i;
                break;
            }
        }
        
        if(index==-1) System.out.println("Value doesn't exists");

        else System.out.println("First occurrence of a target value's index is "+index);
    }
}
