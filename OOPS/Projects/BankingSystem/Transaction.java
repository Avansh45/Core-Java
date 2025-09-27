package OOPS.Projects.BankingSystem;

interface Transaction {
    int charges = 50;
    void deposit(double depositamt);
    void withdraw(double withdrawamt);
    void WithdrawCharges(int charges);
}

