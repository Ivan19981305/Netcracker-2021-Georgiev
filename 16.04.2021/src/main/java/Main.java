import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            int someByte;
            while ((someByte = fileInputStream.read()) != -1)
                System.out.print(someByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}