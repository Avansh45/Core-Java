

import java.util.Scanner;

public class PrimeInMethod {
     static boolean isPrime(int n){

            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    
                    return false;
                }
                
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int x=s.nextInt();
        if(isPrime(x)==true){
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Its a not prime number");
        }
        s.close();

    }
}
