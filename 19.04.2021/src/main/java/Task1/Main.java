package Task1;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        //"D:\\repos\\Netcracker-2021-Georgiev\\16.04.2021\\src\\main\\resources\\test.txt"
        try(InputStream fileInputStream = new URL("https://ru.wikipedia.org/wiki/%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%A1%D0%BB%D1%83%D1%87%D0%B0%D0%B9%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0").openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\repos\\Netcracker-2021-Georgiev\\16.04.2021\\src\\main\\resources\\test2.txt")) {
            byte[] someByte = new byte[1024];
            int length = 0;
            while ((length = fileInputStream.read(someByte)) != -1)
                fileOutputStream.write(someByte);
            fileOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}