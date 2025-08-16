
public class DecimalToBinary {
    public static void main(String[] args) {
        int num =124;
        int j=0;
        int[]arr = new int[100];
        int count=0;
        while(num!=0){

            int x=num%2;
            num=num/2;
            arr[j]=x;
            
            // System.out.print(arr[j]+" ");
            count++;
            j++;
        

        }
        System.out.print("\nBinary Number: ");
        int k=1;
        for (int i=0;i<count;i++) {
            int temp=arr[j];
            arr[j]=arr[count-k];
            arr[count-k]=temp;
            System.out.print(arr[j]+" ");
            k++;

        }
            
            
        
    }
}
