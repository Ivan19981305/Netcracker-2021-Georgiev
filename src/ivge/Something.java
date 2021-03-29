package ivge;

import java.io.Serializable;

public class Something<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T first;
    private V second;
    private K third;

    public Something() {
    }

    public Something(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void getClassNames(){
        System.out.println(first.getClass().getName());
        System.out.println(second.getClass().getName());
        System.out.println(third.getClass().getName());
    }
}
