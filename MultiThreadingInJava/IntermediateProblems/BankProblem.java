package MultiThreadingInJava.IntermediateProblems;
// 🟡 Problem 4: Bank Account Problem (Race Condition)
// Task:
// Account starts with balance = 1000
// Two threads withdraw 700 each
// Show wrong output without synchronization
// Fix it using synchronized
class Bank{
    private int balance = 1000;

    public synchronized void withdraw(int amount){
        if(balance>=amount){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + "- withdraw "+amount +" , Reamaining balance: "+balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
        }
    }

    public int getBalance(){

        return balance;
    }

}

class BankThread extends Thread{
    Bank bank;

    BankThread(Bank bank,String name){

        super(name);
        this.bank = bank;
    }
    public void run(){
        bank.withdraw(900);
    }
}
public class BankProblem {
    public static void main(String[] args) {
        
        Bank bank = new Bank();

        BankThread th1 = new BankThread(bank,"Thread One");
        BankThread th2 = new BankThread(bank,"Thread Two");

        th1.start();
        th2.start();


    }
}
