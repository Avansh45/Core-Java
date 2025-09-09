package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        
        int n=5;
        int stars = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-(i+1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-(i+1);j++){
                System.out.print(" ");
            }
            stars+=2;
            System.out.println();
        }
    }
}

        // OUTPUT:->
        //       *      
        //      ***
        //     *****
        //    *******
        //   *********
