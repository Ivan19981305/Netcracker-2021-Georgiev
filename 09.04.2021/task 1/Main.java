package ivge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        ArrayList<String> arrrayList = new ArrayList<String>();

        /*
        Adding:
Linked list:8
Array list:17
Getting:
Linked list:7422
Array list:11
Deleting:
Linked list:3
Array list:1197
         */



        System.out.println("Adding:");

        long start = new Date().getTime();

        for (int i = 0; i < 100000; i++)
        {
            linkedList.add("some string");
        }

        long end = new Date().getTime();

        System.out.println("Linked list:" + (end - start));

        start = new Date().getTime();

        for (int i = 0; i < 100000; i++)
        {
            arrrayList.add("some string");
        }

        end = new Date().getTime();

        System.out.println("Array list:" + (end - start));



        System.out.println("Getting:");

        start = new Date().getTime();

        for (int i = 0; i < 100000; i++)
        {
            linkedList.get(50000);
        }

        end = new Date().getTime();

        System.out.println("Linked list:" + (end - start));

        start = new Date().getTime();

        for (int i = 0; i < 100000; i++)
        {
            arrrayList.get(50000);
        }

        end = new Date().getTime();

        System.out.println("Array list:" + (end - start));




        System.out.println("Deleting:");

        start = new Date().getTime();

        for (int i = 0; i < 100000; i++)
        {
            linkedList.remove(0);
        }

        end = new Date().getTime();

        System.out.println("Linked list:" + (end - start));

        start = new Date().getTime();

        for (int i = 0; i < 100000; i++)
        {
            arrrayList.remove(0);
        }

        end = new Date().getTime();

        System.out.println("Array list:" + (end - start));

    }
}