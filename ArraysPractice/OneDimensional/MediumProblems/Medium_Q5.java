package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q5 {
    public static void main(String[] args) {
        // Find the pair of elements whose sum equals a given target (unsorted array / two-sum).
        int [] arr ={2,8,6,5,3};
        int target=11,a=0,b=0;
        boolean found =false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    a=arr[i];
                    b=arr[j];
                    found=true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
            
        if(found){
            System.out.println("Two Numbers are "+a+" and "+b);
        }
        else{
            System.out.println("Numbers not found!");
        }
    }
}
