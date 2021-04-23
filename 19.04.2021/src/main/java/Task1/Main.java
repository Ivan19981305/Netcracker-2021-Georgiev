package Task1;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Car car = new Car("4 wheels", "Big", "1st type");

        try (OutputStream outputStream = new FileOutputStream("text.json");
             InputStream inputStream = new FileInputStream("text.json")){
            objectMapper.writeValue(outputStream, car);

            Car car1;

            car1 = objectMapper.readValue(inputStream, Car.class);

            
            System.out.println(car1);
        }
    }
}