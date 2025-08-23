class Thread1 implements Runnable{
    public void run(){
        int n=200,i=1;
        while(i<=n){
            System.out.println("####Thread1 using Runnable Method####");
            i++;
        }

    }
}
class Thread2 implements Runnable{
    public void run(){
        int n=200,i=1;
        while(i<=n){
            System.out.println("****Thread2 using Runnable Method****");
            i++;
        }

    }
}
public class ThreadUsingRunable {
    public static void main(String[] args) {
        //create class object and then thread onject with argument as class object's name
        Thread1 t1= new Thread1();
        Thread obj1=new Thread(t1);
        

        Thread2 t2= new Thread2();
        Thread obj2=new Thread(t2);

        obj1.start();
        obj2.start();
        
    }
}
