package OOPS.ClassesAndObjects;
import java.util.Scanner;
class Book{
    int Book_Id;
    String Author;
    String Title;
    double price;

    Book(int Book_Id, String Title, String Author, double price){
        this.Book_Id =Book_Id;
        this.Title = Title;
        this.Author = Author;
        this.price = price;
    }

    void applyDiscount(double percentage){
        double discountPrice = (price * percentage)/100;
        price = price-discountPrice;
        System.out.println("New Price =" +price);
    }
    
    void displayDetails(){
        System.out.println("Book Id: "+Book_Id);
        System.out.println("Book Title: "+Title);
        System.out.println("Author Name: "+Author);
    }


}

public class LibraryProg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number of books:");
        int n = s.nextInt();
        Book [] Books = new Book[n];
        for(int i=0; i<n; i++){

            System.out.println("Enter the details for Book "+(i+1)+" : ");

            System.out.print("Enter the BOok Id: ");
            int Book_Id = s.nextInt();
            s.nextLine();
            System.out.print("Enter the Title of Book:");
            String Title = s.nextLine();
            System.out.print("Enter the Author Name: ");
            String Author = s.nextLine();
            System.out.print("Enter the Price");
            double price = s.nextDouble();
            Books[i] = new Book(Book_Id,Title, Author, price);
        }
        System.out.print("Enter the Discount Percentage:");
        double discount =s.nextDouble();
        System.out.println("\n--------Book Details After Discount:--------");
        for(int i=0; i<n; i++){
            Books[i].displayDetails();
            Books[i].applyDiscount(discount);
        }
        s.close();
    }
}
