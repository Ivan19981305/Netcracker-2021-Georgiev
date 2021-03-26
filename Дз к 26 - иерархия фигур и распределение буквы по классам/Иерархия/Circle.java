package ivge;

public class Circle implements Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    public Circle(int radius) {
        if (radius < 0)
            throw 
        this.radius = radius;
    }
}
