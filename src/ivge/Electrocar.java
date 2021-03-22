package ivge;

public class Electrocar extends Car{
    @Override
    public void move() {
        System.out.println("Electrocar moving");
    }

    @Override
    public void refuel() {
        System.out.println("Electrocar want some electro");
    }

    public Electrocar() {
    }
}
