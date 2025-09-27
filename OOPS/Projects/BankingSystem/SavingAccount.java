package OOPS.Projects.BankingSystem;

class SavingAccount extends CurrentAccount{

    @Override
    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount + " | New Balance: " + balance);
    }

    @Override
    public void withdraw(double withdrawamt) {
        if (withdrawamt <= 0) {
            System.out.println("Amount to be withdrawn cannot be negative or zero!");
        } else if (withdrawamt > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= withdrawamt;
            System.out.println("Withdrawn: " + withdrawamt + " | Remaining Balance: " + balance);
        }
    }

    @Override
    public void WithdrawCharges(int charges) {
        // No charges for saving accounts
    }
}
