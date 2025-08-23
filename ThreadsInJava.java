class Running extends Thread{
    public void run(){
        System.out.println("I am Running");
        System.out.println("GOOD");
    }
}
class Exercise extends Thread{
    public void run(){
        System.out.println("I am doing Exercises");
        System.out.println(" BETTER ");
    }
}
class Eating extends Thread{
    public void run(){
        System.out.println("I am Eating");
        System.out.println("BEST");
    }
}
public class ThreadsInJava{
    public static void main(String[] args) {
        Running r = new Running();
        Exercise exer = new Exercise();
        Eating eat = new Eating();
        r.start();
        exer.start();
        eat.start();

    }
}
