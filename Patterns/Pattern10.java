package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        int star=0;
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=1;j<=star+1;j++){
                    System.out.print("*");
                }
                star++;
            }
            else{
                star--;
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
