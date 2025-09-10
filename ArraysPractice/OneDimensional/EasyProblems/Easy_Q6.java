package ArraysPractice.OneDimensional.EasyProblems;

public class Easy_Q6 {
    public static void main(String[] args) {
        
        // Check whether a given value exists in an array (true/false).
        int []arr={55,52,8,7,9,52,86,45,78,5};
        int target=52;
        boolean targetvalue=false;
        for (int a : arr) {
            if(a==target){
                targetvalue=true;
            }
        }
        System.out.println("Value exists in array ?\n "+targetvalue);
    }
}
