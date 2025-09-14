package ArraysPractice.ThreeDimensional.Easy3D;

import java.util.Scanner;

public class Easy_Q5 {
    public static void main(String[] args) {
        
        // 5. Print elements layer by layer (2D slices of the 3D array).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Depth:");
        int x = sc.nextInt();

        System.out.println("Enter the Height:");
        int y = sc.nextInt();

        System.out.println("Enter the Width:");
        int z = sc.nextInt();

        int [][][] array = new int [x][y][z];
        System.out.println("Enter the values for 3D array:");
        for(int i=0; i<x; i++)
        {
            System.out.println("Enter values for plane "+(i+1)+":");
            for(int j=0; j<y; j++)
            {
                for(int k=0; k<z; k++)
                {System.out.print("Enter the value for array[" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("3D Array with your entered values:");
        for(int i=0; i<x; i++)
        {
            System.out.println("**** 2D Slice " + (i + 1) + " ****");
            for(int j=0; j<y; j++)
            {
                for(int k=0; k<z; k++)
                {
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
