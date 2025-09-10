package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q7 {
    public static void main(String[] args) {
        
        // Find duplicate elements in an array and print them.
        int arr[] ={1,1,1,1,2,3,4,1,4,5,2,5,6,7};
        System.out.print("Original Array: ");
        for (int a : arr) {
            System.out.print(a+" ");
        }
        System.out.print("\nDuplicate elements in the array are :");
        for(int pass=0;pass<=arr.length-1;pass++){
            for(int j=pass+1;j<arr.length;j++){
                if(arr[pass]==arr[j]){
                    boolean isvisited=false;
                    for(int x=0;x<pass;x++){
                        if(arr[x]==arr[pass]){
                            isvisited =true;
                            break;
                        }
                    }
                    if(!isvisited){
                        System.out.print(arr[pass]+" ");
                        break;
                    }
                    
                }
                
            
            }
        }
    }
}
