package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
        // OUTPUT:->
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1 