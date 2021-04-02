package ivge;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> shop = new ArrayList<>();

        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(shop);//[]

        parent.consumerGet.accept(shop, parent.supplier);//There are no Phone so parent can't get it
        System.out.println(shop);//[]

        parent.consumerAdd.accept(shop);
        System.out.println(shop);//[Phone]

        child.consumerAdd.accept(shop);
        System.out.println(shop);//[Phone, Pic]

        parent.consumerGet.accept(shop, parent.supplier);//Parent got Phone
        System.out.println(shop);//[Pic]

        child.consumerAdd.accept(shop);
        System.out.println(shop);//[Pic, Pic]

        child.consumerAdd.accept(shop);
        System.out.println(shop);//[Pic, Pic, Pic]

        parent.consumerGet.accept(shop, child.supplier);//Parent got Pic
        System.out.println(shop);//[Pic, Pic]

        parent.consumerAdd.accept(shop);
        System.out.println(shop);//[Pic, Pic, Phone]

        child.consumerGet.accept(shop, child.supplier);//Child got 2 that things: Pic
        System.out.println(shop);//[Phone]

        child.consumerGet.accept(shop, parent.supplier);//Child got 1 that things: Phone
        System.out.println(shop);//[]

        /*
[]
There are no Phone so parent can't get it
[]
[Phone]
[Phone, Pic]
Parent got Phone
[Pic]
[Pic, Pic]
[Pic, Pic, Pic]
Parent got Pic
[Pic, Pic]
[Pic, Pic, Phone]
Child got 2 that things: Pic
[Phone]
Child got 1 that things: Phone
[]
*/
    }
}