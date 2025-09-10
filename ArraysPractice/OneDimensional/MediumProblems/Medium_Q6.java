package ArraysPractice.OneDimensional.MediumProblems;

public class Medium_Q6 {
    public static void main(String[] args) {
        int a[]={-5,-1,-2,2,8,9,5,-6,8,7,-6,4,-8,-2 };
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]<0){
                i++;
            }
            if(a[j]>=0){
                j--;
            }
            if(a[i]>=0 && a[j]<0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        for (int array : a) {
            System.out.print(array+" ");
        }
    }
}
