package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q7 {
    public static void main(String[] args) {
        
        // Count how many times a given value appears in an array.
        int array[] ={5,2,6,8,7,5,2,6,4,7,9,5,4,12,566,44,288,45,5,8};
        int value=6;
        int count=0;
        for(int nums:array){
            if(nums==value){
                count++;
            }
        }
        if(count==0){
            System.out.println("Value doesn't exists in the array!");
        }
        else{
            System.out.println("Value exists "+count+" Times in the array!");
        }
    }
}
