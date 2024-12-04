package practise_for_ca.lib;

public class Main
{
    public static void main(String[] args) {

        Book b1 = new Book( "Alchemis", "99999", 999, "Cohere");
        Book b2 = new Book( "rich dad poor dad", "90363", 99090, "kioski");
        Book b3 = new Book( "how to code ", "0", 0, "Adhish");

        Library library = new Library();


        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.displayAllBooks();

        library.searchBookByTitle(b3);

    }
}
