package Task_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args){
        HashMap<String, AtomicInteger> hashMap = new HashMap<>();
        hashMap.put("Dollar", new AtomicInteger(1000));
        hashMap.put("Ruble", new AtomicInteger(1000));
        hashMap.put("Euro", new AtomicInteger(1000));

        String[] hashMapKeys = {"Dollar", "Ruble", "Euro"};
        //Customers
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                while (true) {
                        int randomSmth = (int) (Math.random() * 3);
                        int randomSmthPut = (int) (Math.random() * 3);

                        hashMap.get(hashMapKeys[randomSmth]).getAndIncrement();
                        hashMap.get(hashMapKeys[randomSmthPut]).getAndDecrement();
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
        new Thread(() -> {
            while (true) {

                for (AtomicInteger value : hashMap.values())
                    System.out.println(value);
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

}
