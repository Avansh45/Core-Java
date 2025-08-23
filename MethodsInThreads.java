class ThreadA extends Thread{
    public void run(){
        int i=1;
        while(i<=50){
            System.out.println("Thread A");
            i++;
        }
        
    }
}

class ThreadB extends Thread{
    public void run(){
        int i=1;
        while(i<=50){
            System.out.println("Thread B");
            i++;
        }
        
    }
}
class ThreadC extends Thread{
    public void run(){
        int i=1;
        while(i<=50){
            System.out.println("Thread C");
            i++;
        }
        
    }
}
class ThreadD extends Thread{
    public void run(){
        int i=1;
        while(i<=50){
            System.out.println("Thread D");
            i++;
        }
        
    }
}


public class MethodsInThreads {
    public static void main(String[] args)  {

        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        ThreadC c=new ThreadC();
        ThreadD d=new ThreadD();

        a.setPriority(Thread.MAX_PRIORITY);//priority method
        c.setPriority(Thread.MIN_PRIORITY);
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        a.start();
        b.start();//start method
        c.start();
        d.start();
    }
}
