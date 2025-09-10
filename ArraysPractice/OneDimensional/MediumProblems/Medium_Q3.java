package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q3 {
    public static void main(String[] args) {
        
        // Insert an element at a given index in an array (assume capacity to shift).
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        int insert=2;
        for(int i=arr.length-1;i>insert;i--){
            arr[i]=arr[i-1];
        }
        arr[insert]=100;
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
