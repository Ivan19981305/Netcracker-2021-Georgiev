package ivge;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args){
        int[] randoms = new int[100];
        for (int i = 0; i < 100; i++) {
            randoms[i] = (int) (Math.random() * 1000);
        }

        List<Integer> boxedFilteredRandoms = new ArrayList<>();

        for (int i = 0; i < randoms.length; i++) {
            if (randoms[i] % 2 == 0)
                boxedFilteredRandoms.add(randoms[i]);
        }
    }
}
