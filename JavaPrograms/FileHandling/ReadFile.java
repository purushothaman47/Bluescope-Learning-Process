package FileHandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class readFile {

        public static void main(String[] args) {
            try {
                File myFile = new File("D:/example.doc");
                Scanner scanner = new Scanner(myFile);
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    System.out.println(data);
                }
                scanner.close();
            } catch (Exception e) {
                System.out.println("An error occurred.");
            }
        }
    }


