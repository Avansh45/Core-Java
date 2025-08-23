class ThreadForGM extends Thread{
    public void run(){
        //Infinite loop
        while(true){
            System.out.println("Good Morning");
        }
    }
    
}
class ThreadForWC extends Thread{
    public void run(){
       
        try{
            sleep(200);
        }
        
        catch(Exception e){
            System.out.println(e);
        }
         while(true){
            System.out.println("Welcome" );
         }
    }
        
}

public class ThreadsPractice {
    public static void main(String[] args) {
        ThreadForGM gm=new ThreadForGM();

       
        gm.start();
        ThreadForWC wc = new ThreadForWC();
        wc.start();

        
    }
}
