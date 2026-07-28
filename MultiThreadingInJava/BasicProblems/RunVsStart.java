package MultiThreadingInJava.BasicProblems;
// Problem 3: Understand run() vs start()
// Task:
// Write a program that calls run() directly
// Then modify it to use start()
// Observe and explain difference
class NewThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class RunVsStart {
    public static void main(String[] args) {
        
        NewThread t = new NewThread();
        t.run();
        t.start();
    }
}
