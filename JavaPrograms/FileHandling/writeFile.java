package FileHandling;
import java.io.IOException;
import java.io.FileWriter;
public class writeFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("D:/example.doc");
            writer.write("Hello this is Purushothaman    ");
            writer.write("im from chennai ");
            writer.write(" Java");
            writer.close();
            System.out.println("File write is completed");
        }
        catch(Exception e){
            System.out.println("Not write");
        }
    }
}
