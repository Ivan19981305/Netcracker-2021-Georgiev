package ivge;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Fruit [] fruits = new Fruit[100];

        for(int i = 1; i < 10; i++)
            fruits[i] = new Fruit();

        Basket<Fruit> basket;
        basket.setBasket(fruits);

        System.out.println(basket.countNotNull());
        System.out.println(basket.sumNotNull());

    }
}
