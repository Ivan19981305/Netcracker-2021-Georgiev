package ivge;

public class Basket<T> {
    private T[] basket;
    private int length = 0;

    public Basket(T[] basket) {
        this.basket = basket;
        this.length = basket.length;
    }

    public int get() {
        return length;
    }

    public void add(T item) {
        basket[length++] = item;
    }
}
