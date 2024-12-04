package practise_for_ca.lib;

import java.util.ArrayList;

public class Library {
    public  ArrayList<Book> books;
    Library() {
         this.books   = new ArrayList<>();
    }
    public  void  addBook(Book b){
        this.books.add(b);
        System.out.println("Book added : "+b.getName());
    }
    public  void  displayAllBooks(){
        for(Book book : this.books){
            book.displayDetails();
        }
    }

    public  void searchBookByTitle(Book b){
        boolean isFound = false;
        for(Book bookcollection : this.books){

            if(bookcollection.getName().equalsIgnoreCase(b.getName())){
                System.out.println("book found in the library ");
                b.displayDetails();
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("book is not found in the library");
        }
    }

}
