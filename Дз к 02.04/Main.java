package ivge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> trash = new LinkedList<String>();

        while (true) {
            for(int i = 0; i < 100; i++)
                trash.add(new String("Trash"));
            for(int i = 0; i < 10; i++)
                trash.remove();
            if (trash.size() > 2000000)
                trash.clear();
        }
    }
}