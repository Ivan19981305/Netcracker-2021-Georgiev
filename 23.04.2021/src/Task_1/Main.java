package Task_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Dollar", 1000);
        hashMap.put("Ruble", 1000);
        hashMap.put("Euro", 1000);

        String[] hashMapKeys = {"Dollar", "Ruble", "Euro"};
        //Customers
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                while (true) {
                    synchronized (hashMap) {
                        int randomSmth = (int) (Math.random() * 3);
                        int randomSmthPut = (int) (Math.random() * 3);
                        if (hashMap.get(hashMapKeys[randomSmth]) > 0) {
                            hashMap.put(hashMapKeys[randomSmth], hashMap.get(hashMapKeys[randomSmth]) - 1);
                            hashMap.put(hashMapKeys[randomSmthPut], hashMap.get(hashMapKeys[randomSmthPut]) + 1);
                        }
                        try {
                            hashMap.wait(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }).start();
        }
        new Thread(() -> {
            while (true) {
                synchronized (hashMap) {
                    for (Integer value : hashMap.values())
                        System.out.println(value);
                    try {
                        hashMap.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }

}
