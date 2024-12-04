package two.library;

public class Book {
    String title, author , book;
    Book(String title , String author, String book)
    {
        this.title  = title;
        this.author  = author;
        this.book = book;
    }   

    void displayDetails()
    {
        System.out.println("Book");
        System.out.println("Title :"+this.title);
        System.out.println("Author :"+this.author);
        System.out.println("Book :"+this.book);

    }
}

