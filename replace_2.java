
public class replace_2 {
    public static void main(String [] args){
        String letter ="Dear <|name|> , Thanks a lot";
        letter = letter.replace("<|name|>", "Avansh");
        System.out.println(letter);

    }
}
