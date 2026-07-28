package MultiThreadingInJava.BasicProblems;

//Create a program using a volatile boolean flag to stop a worker thread.
class ServerRunning implements Runnable{
    private volatile boolean running = true;

    public void run(){
        while(running){
            try{
                Thread.sleep(100);
                System.out.println("Service is running on " + Thread.currentThread().getName());
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Worker Thread Stopped");
    }
    public void stopRunning(){
        running = false;
    }
}
public class VolatileExample {
    public static void main(String[] args) {

        ServerRunning serverRunning = new ServerRunning();
        Thread thread = new Thread(serverRunning,"Worker Thread");
        thread.start();
        try {

           Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Server is going to stop");
        serverRunning.stopRunning();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Server Stopped !");

    }
}
