import java.util.Scanner;

class MyOwnException extends Exception{
    public String toString(){
        return "TU pagal hai kya Age Negative kaise ho skti h...";
    }
    public String getMessage(){
        return "Aur agrr tune negative nahi bi dali h toh age 125 se jada kaise ho skti h ...";
    }
}
public class CustomException {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age<=0 || age >=125){
                throw new MyOwnException();
                
            }
            else{
                System.out.println("You have entered "+age+" age !");
            }
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        
    }
}
