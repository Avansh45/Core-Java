class ThThread extends Thread{
    public ThThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am Thread 1");
    }
}
class ThRunnable implements Runnable{
    public ThRunnable(String name){
        super();
    }
    public void run(){
        System.out.println("I am Thread 2");
    }
}
public class ThreadWithNameId {
    public static void main(String[] args) {
        
        ThThread t1 = new ThThread("Anshu");

        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.start();

        ThRunnable th2 = new ThRunnable("Avansh");
        Thread obj = new Thread(th2,"Avansh");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        obj.start();
    
    }
}
