

public class PracticeSetMethods {

    //To print the Multiplication table 
    static void multiplication(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+" x "+ i +" = "+x*i);
        }
        
    }

    static void Pattern1(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static int sumOfNums(int n){

        if(n<0){
            return 0;
        }
        return n+sumOfNums(n-1);
    }

    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }


    static void nums_Average(float ...n){
        int sum=0;
        for(float nums:n){
            sum+=nums;
        }
        float avg=sum/n.length;
        System.out.println(avg);
    }


    static void pattern1_Rec(int n){

        if(n>0){
            pattern1_Rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
        }
        System.out.println();
    }
    // static void pattern2_Rec(int n){

    //     if(n>0){
    //         pattern1_Rec(n);
    //         for(int i=n;i<=0;i++){
    //             System.out.print("* ");
    //         }
    //     }
    //     System.out.println();
    // }

    static void temp(float C){
        float x=9f/5f;
        float F = (C*x) + 32;
        System.out.println(F);
    }



    static void sumNums(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // multiplication(5);
        // Pattern1(4);
        // System.out.println(sumOfNums(25));
        // pattern2(5);
        // System.out.println(fibo(5));
        // nums_Average(56,89,57,59,25,55);
        // pattern1_Rec(5);
        // temp(52);
        sumNums(5);
        
        

    }
}
