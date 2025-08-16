
// Program to check leap year
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        
        Scanner ss=new Scanner(System.in);
        System.out.print("Enter a Year:");
        int year=ss.nextInt();
        
        boolean leap_year = false;
        if(year%4==0){

            if(year%100==0){

                if(year%400==0)
                    leap_year=true;
                
                else
                    leap_year=false;
            }    
            
            else
                leap_year=true;
            
            
        }
            else{
            leap_year=false;
            }
    
        if(leap_year)
        {
            System.out.println(year +" is a Leap Year.");
        }
        else
        {
            System.out.println(year+" is not a Leap Year.");
        }
        ss.close();
    }
}

