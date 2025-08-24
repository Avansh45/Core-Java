import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidOperatorException extends Exception{
    public String getMessage(){
        return "Invalid Operator";
    }
}
class MaxInputException extends Exception{
    public String getMessage(){
        return "You cannot provide input more than 100000";
    }
}
class MaxMultiplierException extends Exception{
    public String getMessage(){
        return "You can multiply the value less than 7000 only!";
    }
}
public class ExceptionCalculator {
    public static Integer Calculator(){
        
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter First Number:");
            int num1=sc.nextInt();

            System.out.print("Enter Second Number:");
            int num2=sc.nextInt();
            
            System.out.print("Enter Operator(+,-,*,/):");
            char ch=sc.next().charAt(0);
        
            if(num1>100000 || num2>100000){
                throw new MaxInputException();
            }

            else if((ch!='+')&&
            (ch!='-')&&
            (ch!='*')&&
            (ch!='/')){
                throw new InvalidOperatorException();
                
                }
            else if(ch=='*' && (num1>7000 || num2>7000)){
                throw new MaxMultiplierException();
            }
            else if(ch=='+'){
                return num1+num2;
                
            }
            else if(ch=='-'){
                return num1-num2;
            }
            else if(ch=='*'){
                return num1*num2;
            }
            else if(ch=='/'){
                    if(num2!=0)
                        return num1/num2;
                    else{
                        throw new ArithmeticException();
                    }
            }
         }
         catch(MaxInputException e){
                System.out.println(e.getMessage());
            }
        
            catch(InvalidOperatorException e){
                System.out.println(e.getMessage());
                
            }
            catch(MaxMultiplierException e){
                System.out.println(e.getMessage());
            }
            catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
            catch(InputMismatchException e){
                System.out.println("Provide a input as number only!");
            }
        return null;

    }
    public static void main(String[] args) {
        Integer answer = Calculator();
        if(answer != null)
            System.out.println("Result :"+answer);
        
    }
}
