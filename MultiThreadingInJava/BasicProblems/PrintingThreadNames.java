package MultiThreadingInJava.BasicProblems;
// Problem 2: Single Task, Multiple Threads
// Task:
// Create 3 threads
// All threads execute the same task
// Each thread prints its name and iteration number (1–5)
class RunnableTask implements Runnable{

    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}
class WorkingThread1 extends Thread{

    WorkingThread1(String name){
        super(name);
    }
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}
class WorkingThread2 extends Thread{
    WorkingThread2(String name){
        super(name);
    }
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }
}
public class PrintingThreadNames {
    public static void main(String[] args) {
        
        RunnableTask t1 = new RunnableTask();
        Thread t = new Thread(t1,"RunnableTask");
        WorkingThread1 t2 = new WorkingThread1("WorkingThread1");
        WorkingThread2 t3 = new WorkingThread2("WorkingThread2");
        t.start();
        t2.start();
        t3.start();
    }
}
