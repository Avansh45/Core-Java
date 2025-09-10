package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q8 {
    public static void main(String[] args) {
        
        // Print the frequency of each distinct element in an array.
        int[] array={1,5,2,4,8,5,1,2,4,5,1,5,4,6,4,5};
        
        for(int pass=0;pass<=array.length-1;pass++){
            int count=1;
            boolean isprint=true;
            for(int j=pass+1;j<array.length;j++){
                
                if(array[pass]==array[j]){
                    count++;
                }
            }
            for(int k=0;k<pass;k++){
                if(array[k]==array[pass]){
                    isprint=false;
                    break;
                }
            }
            if(isprint){
                System.out.println(array[pass]+" -> "+count);
            }
        }
    }
}
