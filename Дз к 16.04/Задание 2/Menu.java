package ivge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {
    private LinkedHashMap<String, Method>  menuItems;
    private LinkedHashMap<String, Method>  menuItemsAdding;
    private boolean accessOrder = false;

    public Menu() throws NoSuchMethodException {
        menuItems = new LinkedHashMap<String, Method>(16, (float) 0.75,true);
        menuItemsAdding = new LinkedHashMap<String, Method>(16, (float) 0.75,false);
        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method method : methods) {
            //System.out.println(method.getName());
            if (method.getName().equals("addItem")) {
                menuItems.put("Добавить пункт меню.", method);
                menuItemsAdding.put("Добавить пункт меню.", method);
            }
            if (method.getName().equals("changeOrder")) {
                menuItems.put("Изменить порядок пунктов меню.", method);
                menuItemsAdding.put("Изменить порядок пунктов меню.", method);
            }
        }
        //menuItems.put("Добавить пункт меню.", addItem);
    }

    private void addItem(){
        Scanner in = new Scanner(System.in);
        String item = in.nextLine();
        //in.close();
        if (menuItems.containsKey(item))
            System.out.println("Такой пункт уже существует");
        else {
            menuItems.put(item, null);
            menuItemsAdding.put(item, null);
        }
    }

    private void changeOrder(){
        System.out.println("в порядке добавления.");
        System.out.println("в порядке использования.");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //in.close();

        if (input.equals("в порядке добавления.")){
            accessOrder = false;
        } else if (input.equals("в порядке использования.")){
            accessOrder = true;
        }
        else
            System.out.println("Некорректная команда");
    }

    private void printMenu(){
        System.out.println();
        if (accessOrder) {
            for (Map.Entry<String, Method> key : menuItems.entrySet())
                System.out.println(key.getKey());
        }
         else{
            for (Map.Entry<String, Method> key : menuItemsAdding.entrySet())
                System.out.println(key.getKey());
        }
    }

    public void action() throws InvocationTargetException, IllegalAccessException {
        printMenu();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //in.close();
        if (menuItems.containsKey(input))
        {
            Method method = menuItems.get(input);
            if (method != null)
                method.invoke(this);
            else {
                System.out.println("Был вызван метод " + input + " добавленный пользователем");
            }
        }
        else {
            System.out.println("Был вызван метод " + input + " не добавленный никем");
        }
    }
}
