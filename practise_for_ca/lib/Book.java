package practise_for_ca.lib;

public class Book {
    private  String name;
    private String isbn;
    private Integer price;
    private String author;

    public Book(String name, String isbn, Integer price, String author) {
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void displayDetails() {
        System.out.println("Book Details : \n");
        System.out.println("Name : "+ this.name);
        System.out.println("Author : "+ this.author);
        System.out.println("Price : "+ this.price);
        System.out.println("ISBN : "+ this.isbn);
        System.out.println("\n\n");
    }
}
