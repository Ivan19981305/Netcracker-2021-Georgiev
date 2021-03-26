package ivge;

public class Basket<T> {
    private T[] basket;

    public Basket(T[] basket) {
        this.basket = basket;
    }

    public T[] getBasket() {
        return basket;
    }

    public void setBasket(T[] basket) {
        this.basket = basket;
    }

    public int countNotNull(){
        int count = 0;
        for (T element:
             basket) {
            if (element != null)
                count++;
        }
        return count;
    }

    public int sumNotNull(){
        int sum = 0;
        for (T element:
                basket) {
            if (element != null)
                sum += element.size();
        }
        return sum;
    }
}
