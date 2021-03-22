package ivge.smth;

public class Parent {
    private int first = 0;
    private int second = 0;


    public Parent() {
        this(0, 0);
    }

    public Parent(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
