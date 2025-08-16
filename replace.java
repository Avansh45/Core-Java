
//java program to replace the spaces from the string with underscores
public class replace {
    public static void main(String[] args) {
        String str = "Java is Programming Language";
        System.out.println("original String : "+str);
        str = str.replace(" ","_");
        System.out.println("\nReplaced String : "+str);
    }
}
