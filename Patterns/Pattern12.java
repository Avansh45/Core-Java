package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n=6;
        int space =(2*n)-2;
        for(int i=0;i<n;i++){
            int num =i+1;
            for(int j=0;j<=i;j++){
                System.out.print(j+1);

            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num--;            
            }
            space-=2;
            System.out.println();
        }


// Other method for printing same pattern
//         int n = 6;
//         for (int i = 0; i < n; i++) {
//             
//             for (int j = 1; j <= i + 1; j++) {
//                 System.out.print(j);
//             }
//             int space = 2 * (n - i - 1);
//             for (int j = 0; j < space; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i + 1; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

    }
}
