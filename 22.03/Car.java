package ivge;

public class Car implements Movable{
    @Override
    public void move() {
        System.out.println("Car moving");
    }

    @Override
    public void refuel() {
        System.out.println("Car want some gasoline");
    }

    public Car() {
    }
}
