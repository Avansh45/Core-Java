package MultiThreadingInJava.BasicProblems;

//Compare a normal int counter with an AtomicInteger counter using multiple threads.


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample implements Runnable{
    int count =0;
    AtomicInteger atomicCount = new AtomicInteger(0);

    public void run(){
        for(int i = 1; i <= 1000000; i++){
            atomicCount.incrementAndGet();
            count++;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        AtomicIntegerExample example = new AtomicIntegerExample();

        Thread t1 = new Thread(example,"First Thread");
        Thread t2 = new Thread(example,"Second Thread");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Atomic Count : " + example.atomicCount.get());
        System.out.println("Normal Count : "+ example.count);
    }
}
