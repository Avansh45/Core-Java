package OOPS.Projects.BankingSystem;

public class CurrentAccount extends Account implements Transaction {
    double depositamount;
    double withdrawamount;

    @Override
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    @Override
    public void withdraw(double withdrawamount) {
        if (withdrawamount + Transaction.charges > balance) {
            System.out.println("Insufficient Balance for withdraw amount " + withdrawamount
                    + " and Transaction Charges " + Transaction.charges);
        }
        else if(withdrawamount<0){
            System.out.println("Amount to be Withdraw cannot be negative !");
        }
        else{
            WithdrawCharges(charges);
            balance -= withdrawamount; 
        }
    }

    @Override
    public void WithdrawCharges(int charges) {
        balance -= charges;
    }
}