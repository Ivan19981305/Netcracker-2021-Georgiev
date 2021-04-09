package ivge;

import java.lang.invoke.SwitchPoint;
import java.util.*;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args){
        Queue<Element> queue = new PriorityQueue<>();

        ArrayList<Computer> arrayList = new ArrayList<Computer>(10){{
            for (int i = 0; i < 10; i++)
                add(new Computer());
        }};
        arrayList.forEach(System.out::println);

        while (true) {
            for (int i = 0; i < 1000; i++)
                queue.add(((Supplier<Element>) () -> {
                    int a = (int) (Math.random() * 4);
                    switch (a) {
                        case 0:
                            return new Hard((int) (Math.random() * 10));
                        case 1:
                            return new Ram((int) (Math.random() * 10));
                        case 2:
                            return new MotherBoard((int) (Math.random() * 10));
                        case 3:
                            return new Box((int) (Math.random() * 10));
                    }
                    //trash
                    return new Hard(15);
                }).get());

            for (int i = 0; i < 1000; i++) {
                new Supplier<Element>()queue.poll();
            }
        }
    }
}