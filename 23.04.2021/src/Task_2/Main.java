package Task_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {

        File file = new File("D:\\Библиотека\\Программирование");
        Stream<File> stream = Arrays.stream(file.listFiles());

        try(OutputStream outputStream = new FileOutputStream("text.txt")) {
            for (int i = 0; i < 5; i++) {
                new Thread(()->{
                    stream.forEach((file1) -> {
                        String string = file.getName();
                        for (char char1 : string)
                        outputStream.write(char);
                    });
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
