package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q5 {
    public static void main(String[] args) {
        // Find the pair of elements whose sum equals a given target (unsorted array / two-sum).
        int [] arr ={2,8,6,5,3};
        int target=11,a=0,b=0;
        boolean found =false;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+arr[i+1])==target){
                a=arr[i];
                b=arr[i+1];
                found=true;
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
