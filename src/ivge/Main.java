package ivge;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args){
        TreeMap<String, Integer> users = new TreeMap<>();

        users.put("Иван Иванов", 1984);
        users.put("Андрей Иванов", 1984);
        users.put("Ярослав Иванов", 1984);
        users.put("Илья Иванов", 1984);

        for (String key : users.keySet())
            System.out.println(key);
    }
}
