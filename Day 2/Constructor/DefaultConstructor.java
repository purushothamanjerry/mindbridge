package day2;
class Book
{
    String title;
    String author;
    Book()
    {
        title="Harry Potter";
        author="J. K. Rowling";
    }
    void DisplayBookDetails()
    {
        System.out.println("****************************************");
        System.out.println("Book Title : "+title);
        System.out.println("Book Author : "+author);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
     Book b1 = new Book();
     b1.DisplayBookDetails();
    }
}
