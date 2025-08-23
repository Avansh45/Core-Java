import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        //This program will print the value for the array index but if  Array out of bound exceptio it will handle automatically.
        int [] arr = new int[3];
        arr[0]=25;
        arr[1]=45;
        arr[2]=65;
        Scanner s=new Scanner(System.in);
        boolean exit=true;
         while(exit){
            try{
            
                    System.out.println("Enter the indexx of array for printing the value:");
                    int a  =s.nextInt();
                    System.out.println(arr[a]);
                    exit = false;
                }
            
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The below mentioned exception occured...");
                System.out.println(e);
                System.out.println("Enter the value again!");
            }
        }
        s.close();
    }
}
