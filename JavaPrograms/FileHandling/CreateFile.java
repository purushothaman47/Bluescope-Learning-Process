package FileHandling;
import  java.io.File;
import java.io.IOException;
public class createFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("D:/example.doc");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
