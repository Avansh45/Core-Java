//java program to detect the double and triple spaces in the string using indexOFmethod
public class spaces_detector {
    public static void main(String[] args) {
        String str1="This String includes  double   and triple   spaces";
        int double_space =str1.indexOf("  ");
        System.out.println(double_space);
        
        int triple_space =str1.indexOf("   ");
        System.out.println(triple_space);
        
    }
}
