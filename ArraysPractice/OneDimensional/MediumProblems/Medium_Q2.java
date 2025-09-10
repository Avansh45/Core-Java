package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q2 {
    public static void main(String[] args) {
        
        // Check if an array is a palindrome.
        int arr[] ={1,2,1,2,1};
        boolean isPalindrome=true;

        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Yes, the given array is palindrome");
        }
        else{
            System.out.println("No, the given array is not palindrome");
        }
        
       
    }
}
