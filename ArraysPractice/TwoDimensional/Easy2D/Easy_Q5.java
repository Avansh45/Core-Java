package ArraysPractice.TwoDimensional.Easy2D;

public class Easy_Q5 {
    public static void main(String[] args) {
        
        // 5. Find the sum of each column in a 2D array.
        int [][] arr={{1,5,2,6,4},
                      {5,7,8,9,6},
                      {85,25,8,8}                    
                    };
        int maxColLen=0;
        for(int[] a: arr){
            if(a.length>maxColLen){
                maxColLen=a.length;
            }
        }
        int colnum=1;
        for(int i=0;i<maxColLen;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(i<arr[j].length){
                    sum+=arr[j][i];
                }
            }
            System.out.println("column "+colnum++ +" : " + sum);
        }
    }
}
