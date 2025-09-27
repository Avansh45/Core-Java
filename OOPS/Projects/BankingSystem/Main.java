package OOPS.Projects.BankingSystem;
import java.util.Random;
import java.util.Scanner;
public class Main{
    
    static  int randomAccNo() {
        Random r = new Random();
        int acc_no = r.nextInt(2005,255555);
        return acc_no;
       
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CurrentAccount account = null;
        System.out.println("Current Account will take RS. 50 on every Transaction !");
        System.out.println("Enter 1 for Savings Account and 2 for Current Account: ");
        int option = sc.nextInt();
        switch(option){
            case 1 -> account = new SavingAccount();
            case 2 -> account = new CurrentAccount();
            default -> {
                System.out.println("Sorry, Creation of any Other account is not possible !");
                sc.close();
                return;
            }
        }
        sc.nextLine();
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        account.setName(name);
        account.setAcc_no(randomAccNo());
        System.out.println("Your Account Number: "+account.getAcc_no());
        System.out.println("Account Created Successfully!");
        System.out.println("You got 500 Bonus from our Side!!!");
        account.balance+=500;
        
        int choice;
        do{ 
            System.out.println("Enter your choice:\n 1 for Balance:\n 2 for Deposit Money:\n 3 for withdraw Money:\n 4 fot exit:");
            choice = sc.nextInt();
            switch(choice){
                case 1 -> account.showBalance();
                case 2 -> {
                    System.out.println("Enter Amount to be deposited:");
                    double amt = sc.nextDouble();
                    account.deposit(amt);
                }
                case 3 -> {
                    System.out.println("Enter Amount to be Withdraw:");
                    double amt = sc.nextDouble();
                    account.withdraw(amt);
                }
                case 4 -> System.out.println("ThankYou for banking with Us!");

                default -> System.out.println("Invalid choice!");

            }
        }while(choice!=4);

        sc.close();

    }

}
