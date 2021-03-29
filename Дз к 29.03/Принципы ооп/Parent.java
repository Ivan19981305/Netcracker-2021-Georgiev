package ivge;

public interface Parent {
    default public void method(){
        System.out.println("Do something");
    }

    default public void anotherMethod(){
        System.out.println("Do something another");
    }


}
