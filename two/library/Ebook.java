package two.library;

public class Ebook extends Book{
    int size;
    Ebook(String title , String author, String book, int size ){
        super(title, author, book);
        this.size = size;
    }


    @Override
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Size :"+this.size);

    }
}
