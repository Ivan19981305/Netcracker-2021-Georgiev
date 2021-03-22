package ivge;

import ivge.smth.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Parent parent = new Parent();

        System.out.println(parent.getFirst());
        System.out.println(parent.getSecond());

        Child child = new Child();

        System.out.println(parent.getFirst());
        System.out.println(parent.getSecond());
    }
}
