package file_ex;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;


import java.nio.file.Path;
import java.nio.*;
import java.sql.SQLOutput;

class FileHandling {
    void createFileExample(String path){
        Path filePath = Path.of(path);
        if(Files.exists(filePath)){
            System.out.println("File already exists ");
        }
        else{
            try {
                Files.createFile(filePath);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }


    void deleteFileExample(String path){
        Path filePath = Path.of(path);
        if(Files.exists(filePath)){
            try{
                Files.delete(filePath);
                System.out.println("File deleted successfully");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("File doesnt exist");
        }

    }

    void readFileExample(String path){
        Path filePath = Path.of(path);
        if(Files.exists(filePath)){
            try{
                String content = Files.readString(filePath);
                System.out.println(content);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }


    }


    void writeFileExample(String path, String content){
        Path filePath=  Path.of(path);
        if(Files.exists(filePath)){
            try{
                Files.writeString(filePath,  content , StandardOpenOption.WRITE);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class FileEx {
    public static void main(String[] args) {

        FileHandling obj = new FileHandling();
        obj.writeFileExample("D:\\Learning\\OOPS\\data.txt", "\n\nthis is a sample text from Filex.java");
    }
}
