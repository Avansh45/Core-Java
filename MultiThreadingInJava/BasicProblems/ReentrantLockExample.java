package MultiThreadingInJava.BasicProblems;

//Rewrite a synchronized counter using ReentrantLock.

import java.util.concurrent.locks.ReentrantLock;

class Counter implements Runnable {

    private int count = 0;

    private final ReentrantLock lock = new ReentrantLock(true);

    public int getCount() {
        return count;
    }

    @Override
    public void run() {

        lock.lock();

        try {
            for (int i = 0; i < 10000; i++) {
                count++;
            }
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockExample {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(counter, "T1");
        Thread t2 = new Thread(counter, "T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + counter.getCount());
    }
}