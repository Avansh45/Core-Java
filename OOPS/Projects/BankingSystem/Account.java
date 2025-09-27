package OOPS.Projects.BankingSystem;

class Account {
    private String name;
    private int acc_no;
    protected double balance;

    public int getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
    
}
