package ivge;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> shop = new ArrayList<>();

        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(shop);

        parent.consumerAdd.accept(shop);
        System.out.println(shop);

        child.consumerAdd.accept(shop);
        System.out.println(shop);

        parent.consumerGet.accept(shop);
        System.out.println(shop);

        child.consumerAdd.accept(shop);
        System.out.println(shop);

        /*
[]
[Phone]
[Phone, Pic]
[Pic]
[Pic, Pic]*/
    }
}