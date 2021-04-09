package ivge;

import java.lang.invoke.SwitchPoint;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args){
        Deque<Element> queue = new ArrayDeque<>();

        ArrayList<Computer> arrayList = new ArrayList<Computer>(){{
            for (int i = 0; i < 100; i++)
                add(new Computer());
        }};
        arrayList.forEach(System.out::println);

        while (!(((Supplier<Boolean>) () -> {
            for (Computer computer : arrayList)
                if (computer.isComplete())
                    return Boolean.TRUE;
            return Boolean.FALSE;
        }).get())) {
            for (int i = 0; i < 1000; i++)
                queue.addFirst(((Supplier<Element>) () -> {
                    int a = (int) (Math.random() * 4);
                    Element ans = new Hard(-1);
                    switch (a) {
                        case 0:
                            ans = new Hard((int) (Math.random() * 100));
                            break;
                        case 1:
                            ans = new Ram((int) (Math.random() * 100));
                            break;
                        case 2:
                            ans = new MotherBoard((int) (Math.random() * 100));
                            break;
                        case 3:
                            ans = new Box((int) (Math.random() * 100));
                            break;
                    }
                    return ans;
                }).get());


            for (int i = 0; i < 1000; i++) {
                Element element = queue.pollLast();
                //бесполезная проверка
                assert element != null;
                String a = element.getClass().getName();

                switch (a) {
                    case "ivge.Hard":
                        arrayList.get(element.getId()).setHard((Hard) element);
                        break;
                    case "ivge.Ram":
                        arrayList.get(element.getId()).setRam((Ram) element);
                        break;
                    case "ivge.MotherBoard":
                        arrayList.get(element.getId()).setMotherBoard((MotherBoard) element);
                        break;
                    case "ivge.Box":
                        arrayList.get(element.getId()).setBox((Box) element);
                        break;
                }
                ;
            }

            System.out.println(arrayList);
        }
    }
}