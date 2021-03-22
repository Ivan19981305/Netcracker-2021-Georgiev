package ivge.smth;

public class Child extends Parent {
    private int first = 1;
    private int second = 1;

    public Child() {
        this(0, 0);
    }

    public Child(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int getFirst() {
        return first;
    }

    @Override
    public void setFirst(int first) {
        this.first = first;
    }
}
