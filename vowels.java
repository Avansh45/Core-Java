
// Java Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        
        Scanner st = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char ch = st.next().charAt(0);
        ch=Character.toLowerCase(ch);
        
        if(ch== 'a' || ch=='e' || ch==  'i' ||ch==  'o' ||ch== 'u'){

            System.out.println(ch+" is Vowel....");

            
        }
        else if((ch>='a')||(ch<='z')){
            System.out.println(ch +" is consonant....");
        }
        else{
            System.out.println("Invalid input !");
        }
        st.close();
    }
}
