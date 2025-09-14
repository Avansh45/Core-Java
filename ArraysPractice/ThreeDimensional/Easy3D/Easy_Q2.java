package ArraysPractice.ThreeDimensional.Easy3D;
import java.util.Scanner;
public class Easy_Q2 {
    public static void main(String[] args) {
        
        //  Print the Elements and Find the sum of all elements in a 3D array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Depth:");
        int depth = sc.nextInt();
        System.out.println("Enter the Height:");
        int height = sc.nextInt();
        System.out.println("Enter the Width:");
        int width = sc.nextInt();
        int sum=0;

        int [][][] array = new int [depth][height][width];
        System.out.println("Enter the values for 3D array:");
        for(int i=0; i<depth; i++)
        {
            System.out.println("Enter values for plane "+(i+1)+":");
            for(int j=0; j<height; j++)
            {
                for(int k=0; k<width; k++)
                {
                    System.out.print("Enter the value for array "+i+j+k+" :");
                    array[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("3D Array Created:");
        for(int i=0; i<depth; i++)
        {
            System.out.println("Plane "+(i+1)+":");
            for(int j=0; j<height; j++)
            {
                for(int k=0; k<width; k++)
                {
                    System.out.print(array[i][j][k]+" ");
                    sum+=array[i][j][k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sum of all the Elements: "+sum);

        sc.close();

    }
}
