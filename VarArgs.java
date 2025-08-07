package Methods;

public class VarArgs {

    static int sumNumbers(int x,int ...numbers){
            int sum =0;
            for( int elements:numbers){
                sum=sum+elements;
            }
            return sum;
        }
    public static void main(String[] args) {
        System.out.println(sumNumbers(25,36));
        // System.out.println(sumNumbers());//In case of int ...array, it will execute and produce output as 0 but now it is must to add a value of x
        System.out.println(sumNumbers(25,36,22,55,66,45));
    }
}
