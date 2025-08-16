
public class reversed {
        public static void main(String[] args) {
      
          int num = 5648, reversed = 0;
          
          System.out.println("Original Number: " + num);
      
          while(num != 0) 
          {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
          }
      
          System.out.println("Reversed Number: " + reversed);
        }
    
}
