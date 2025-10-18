package Exceptionhandling.CustomExceptions;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

// Create a BankAccount class with balance and a method withdraw(double amount).
// Throw a custom exception InsufficientBalanceException if amount > balance.
// Handle it in main().

class InsufficientBalanceException extends Exception{
    @Override
    public String getMessage(){
        return "Cannot Withdraw Money ---- Insufficient Balance !";
    }
}
class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance) {
            throw new InsufficientBalanceException();
        }
        else {
            balance-=amount;
            System.out.println("Your New Balance : "+balance);;
        }
    }
}
public class WithdrawMoneyException {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);
        BankAccount acc = new BankAccount(5000);
        System.out.println("Your current Balance : "+5000);
        System.out.print("Enter the amount to be withdraw :");
        double amount = o.nextDouble();
        o.close();
        try{
            acc.withdraw(amount);
        }catch(InsufficientBalanceException e){
            
            System.out.println(e.getLocalizedMessage());
        }
    }
}