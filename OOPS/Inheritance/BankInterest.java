package OOPS.Inheritance;

class Bank{

    double getRateOfInterest(){
        return 5;
    }
    Bank(){
        System.out.println("Constructor from Bank Class");
    }
}
class SBI extends Bank{
    @Override
    double getRateOfInterest(){
        return 4.5;

    }
    SBI(){
        System.out.println("Constructor from SBI Bank Class");
    }
}
class AXIS extends Bank{
    @Override
    double getRateOfInterest(){
        return 7;
    }
    AXIS(){
        System.out.println("Constructor from AXIS Bank Class");
    }
}
class ICICI extends Bank{
    @Override
    double getRateOfInterest(){
        return 3.5;
    }
    ICICI(){
        System.out.println("Constructor from ICICI Bank Class");
    }
}
public class BankInterest{
    public static void main(String[] args) {

        
        Bank icici = new ICICI();
        System.out.println(icici.getRateOfInterest());

        Bank sbi = new SBI();
        System.out.println(sbi.getRateOfInterest());

        Bank axis = new AXIS();
        System.out.println(axis.getRateOfInterest());
       
    }
}