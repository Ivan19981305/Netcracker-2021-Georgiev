package ivge;

public class Plane implements Movable{
    @Override
    public void move() {
        System.out.println("Plane flying");
    }

    @Override
    public void refuel() {
        System.out.println("Plane want some fuel");
    }

    public Plane() {
    }
}
