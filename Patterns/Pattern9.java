package Patterns;

public class Pattern9 {
    public static void main(String[] args) {


        //Combination of pattern 7 and pattern 8   OR   below written program
        int n=3;
        int star=1;
        int spaces =0;
        for(int i=1;i<=2*n;i++){
            
            
            if(i<n+1){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                
                star+=2;
            }
            if(i>=n+1){
                
                star-=2;
                for(int j=1;j<=spaces;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=star;j++){
                    System.out.print("*");
                }
                
                spaces=spaces+1;
            }
            System.out.println();
        }
    }
}
