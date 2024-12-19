package FIleUsing_NIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import  java.nio.file.Path;
import java.nio.file.StandardOpenOption;


class FileOps
{String fpath;
    FileOps(String f)
    {
        this.fpath = f;
    }
    public void createFile() throws IOException
    {
        Path path = Path.of(this.fpath);
        if(Files.exists(path))
        {
            System.out.println("File already exists");
        }
        else {
            Files.createFile(path);
        }
    }


    public  void delefile() throws  IOException
    {
        Path path = Path.of(this.fpath);
        if(Files.exists(path))
        {
            Files.delete(path);
        }
        else
        {
            System.out.println("File doesnt exist");
        }

    }


    public  void writeFile(String content ) throws  IOException
    {
        Path path = Path.of(this.fpath);
        if(Files.exists(path))
        {
            Files.writeString(path,content,StandardOpenOption.APPEND);
            System.out.println("Written to file");
        }
    }

    public  void readFile() throws  IOException
    {
        Path path = Path.of(this.fpath);
        String content = Files.readString(path);
    }
}




public class Main {
    public static void main(String[] args) {
        // File path for demonstration
        String filePath = "Semester File Ops Testing.txt";

        // Create an instance of FileOps
        FileOps fileOps = new FileOps(filePath);

        try {
            // Create a new file
            System.out.println("Creating file...");
            fileOps.createFile();

            // Write to the file
            System.out.println("Writing to file...");
            fileOps.writeFile("This is a test content number 2.\n");

            // Read from the file
            System.out.println("Reading from file...");
            fileOps.readFile();

            // Delete the file

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}