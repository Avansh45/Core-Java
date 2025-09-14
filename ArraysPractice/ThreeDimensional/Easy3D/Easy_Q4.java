package ArraysPractice.ThreeDimensional.Easy3D;

import java.util.Scanner;

public class Easy_Q4 {
    public static void main(String[] args) {
        
        // Calculate the average of all elements in a 3D array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Depth:");
        int depth = sc.nextInt();
        System.out.println("Enter the Height:");
        int height = sc.nextInt();
        System.out.println("Enter the Width:");
        int width = sc.nextInt();
        int sum=0;
        int elements=0;
        int [][][] array = new int [depth][height][width];
        System.out.println("Enter the values for 3D array:");
        for(int i=0; i<depth; i++)
        {
            System.out.println("Enter values for plane "+(i+1)+":");
            for(int j=0; j<height; j++)
            {
                for(int k=0; k<width; k++)
                {
                    System.out.print("Enter the value for array[" + i + "][" + j + "][" + k + "]: ");
                    array[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        for(int i=0; i<depth; i++)
        {
            System.out.println("Plane "+(i+1)+":");
            for(int j=0; j<height; j++)
            {
                for(int k=0; k<width; k++)
                {
                    System.out.print(array[i][j][k]+" ");
                    sum+=array[i][j][k];
                    elements++;
                }
                System.out.println();
            }
            System.out.println();
        }
        float avg = (float)sum / elements;
        System.out.println("Average of all the elements in the 3D array: "+avg);
        sc.close();
    }
}
