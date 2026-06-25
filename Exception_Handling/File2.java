import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {

        try {
            FileWriter f1 = new FileWriter("File2_Student.txt");

            f1.write("Hello, How are you? \nAre you Fine?");
            
            f1.close();   // important

            System.out.println("File created and data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}

