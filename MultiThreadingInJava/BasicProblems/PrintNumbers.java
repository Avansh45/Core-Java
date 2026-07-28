package MultiThreadingInJava.BasicProblems;
// Problem 1: Print Numbers Using Two Threads
// Task:
// One thread prints numbers 1–50
// Another thread prints numbers 51–100
// Output can be in any order
class Print1To50 extends Thread{
    public void run(){
        for(int i=1; i<=50;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(i+" ");
        }
    }
}
class Print51To100 extends Thread{
    public void run(){
        for(int i=51; i<=100; i++){
            System.out.print(i+" ");
        }
    }
}
class Print101To150 extends Thread{
    public void run(){
        for(int i=101; i<=150; i++){
            System.out.print(i+" ");
        }
    }
}
public class PrintNumbers {
    public static void main(String[] args) {

        Print1To50 t1 = new Print1To50();
        Print51To100 t2 = new Print51To100();
        Print101To150 t3 = new Print101To150();
        t1.start();
        t3.start();
        try {
            t1.join();
            t3.join();

        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        t2.start();

    }
}