package ivge;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.move();
        car.refuel();

        Plane plane = new Plane();

        plane.move();
        plane.refuel();

        Electrocar car2 = new Electrocar();

        car2.move();
        car2.refuel();
    }
}
