package LambdaExpressions.IntermidiateLevelProblems;

// Use a lambda to start a new thread that prints numbers 1 to 5.
public class ThreadExample {
    public static void main(String[] args) {
        
        Runnable r = () -> {
            for(int i=1;i<=5;i++){
                System.out.print(i+" ");
            }
        };
        Thread th = new Thread(r);
        th.start();
        

        // new Thread(() -> {
        //     for(int i=1;i<=5;i++){
        //         System.out.print(i+" ");
        //     }
        // }).start();
    }
}
