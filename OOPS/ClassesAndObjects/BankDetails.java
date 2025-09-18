package OOPS.ClassesAndObjects;


// Problem:
// Create a BankAccount class with:
// instance variables: accountNumber, holderName, balance.
// static variable: interestRate (same for all accounts).
// static method: setInterestRate(double newRate) to change interest rate for all accounts.
// method displayDetails() to print all info including the current interest rate.
// In main:
// Create 2–3 accounts.
// Change the interest rate using the static method.
// Display details of each account to see the updated interest rate.
class BankAccount{
    int accountNumber;
    String holderName;
    double balance;
    static double interestRate = 3;

    BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber= accountNumber;
        this.holderName= holderName;
        this.balance= balance;
    }

    static void setInterestRate(double newRate){
        
        interestRate = newRate;
    }

    void displayDetails(){
        System.out.println("Acc No.: "+accountNumber);
        System.out.println("Account Holder Name: "+holderName);
        System.out.println("Balance: "+balance);
        System.out.println("Interest Rate: "+interestRate);
    }

}
public class BankDetails {
    public static void main(String[] args) {

        System.out.println("---------------Details Before Changing Interest Rate--------------");
        BankAccount Acc1 = new BankAccount(15874, "Anshu", 8000);
        BankAccount Acc2 = new BankAccount(25874, "Anshi", 7000);
        BankAccount Acc3 = new BankAccount(35462, "Ashu", 6000);
        Acc1.displayDetails();
        Acc2.displayDetails();
        Acc3.displayDetails();
        
        System.out.println("---------------Details After Changing Interest Rate--------------");
        BankAccount.setInterestRate(5.2);
        Acc1.displayDetails();
        Acc2.displayDetails();
        Acc3.displayDetails();
    
    }
    
}
