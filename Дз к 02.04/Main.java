package ivge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        while (true) {
            TrashClass trash = new TrashClass();
        }
    }

    static class TrashClass{
        ArrayList<Integer> trashField = new ArrayList<Integer>(30);
    }
}