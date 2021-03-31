package ivge;

import javax.management.openmbean.KeyAlreadyExistsException;

public class Main {

    public static void main(String[] args) {
        OuterClass.NestedClass nestedClassObject = new OuterClass.NestedClass();
        OuterClass.InnerClass innerClassObject = new OuterClass().new InnerClass();

        action(new Marker() {
            @Override
            public void mark() {
                System.out.println("ama marking");
            }
        });

        action(new Marker() {
            @Override
            public void mark() {
                System.out.println("I'm marking");
            }
        });
    }
    public static void action(Marker marker){
        marker.mark();
    }
}