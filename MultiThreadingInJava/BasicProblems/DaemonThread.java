package MultiThreadingInJava.BasicProblems;

//Practice Question: Background Auto-Save Service (Daemon Thread)
class AutoSavedThread extends Thread {
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Auto-saving document...");
        }
    }
}

class UserThread extends Thread{
    @Override
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("User is Typing....."+j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        AutoSavedThread t1 = new AutoSavedThread();
        t1.setDaemon(true);
        t1.start();

        UserThread t2 = new UserThread();
        t2.start();
    }
}
