package ivge;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Color red = new Color(1, "red");
        Car car1 = new Car("some", red, 2008);
        Car car2 = new Car("some", red, 2008);

        System.out.println(car1.equals(car2));//true
        System.out.println(car1 == car2);//true
    }
}
