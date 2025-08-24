import  java.util.Scanner;
class MyException extends Exception{
    @Override
    public String getMessage(){
        return "Error exceeds limit";
    }
}
public class PracticeThreads {
    public static int gettingIndex(int [] arr) throws MyException{
         Scanner s = new Scanner(System.in);
         
        int i=0;
        while(i<5){
            try{
                int index =s.nextInt();
                return arr[index];
                
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        throw new MyException();
    }
    public static void main(String[] args) {
        
        int [] ar = new int[3];
        ar[0] =55;
        ar[1] =65;
        ar[2] =75;
       
        
        try{
            int value = gettingIndex(ar);
            System.out.println("The Value is "+value);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
