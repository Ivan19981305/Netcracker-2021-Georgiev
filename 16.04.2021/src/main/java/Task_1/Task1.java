import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\repos\\Netcracker-2021-Georgiev\\16.04.2021\\src\\main\\resources\\test.txt");
            int someByte;
            while ((someByte = fileInputStream.read()) != -1)
                System.out.print((char) someByte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}