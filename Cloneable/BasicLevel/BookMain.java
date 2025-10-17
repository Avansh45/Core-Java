package BasicLevel;


// Create a class Book with fields title and author. Implement shallow cloning and print both original and cloned objects.
class Book implements Cloneable{
    private String title;
    private String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    

    public void setTitle(String title) {
        this.title = title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }
    @Override
    public String toString() {
        return "Title of Book :" + title + ",\t Author : " + author;
    }

   

}


public class BookMain{
    public static void main( String[] args) throws CloneNotSupportedException{

        Book b1 = new Book("Java Programming","Amit Karlupia");

        Book b2 = (Book)b1.clone();

        b2.setTitle("DSA in Java");
        b2.setAuthor("Rahil Khatri");

        System.out.println("Original Object : " +b1);
        System.out.println();
        System.out.println("Cloned Object : "+b2);


    }
}