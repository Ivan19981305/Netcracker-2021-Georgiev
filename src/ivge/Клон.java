package ivge;

public class Клон implements Cloneable {
    private String цвет;
    private Оружие оружие;
    private int номер;

    public Клон(String цвет, Оружие оружие, int номер) {
        this.цвет = цвет;
        this.оружие = оружие;
        this.номер = номер;
    }

    public Оружие getОружие() {
        return оружие;
    }

    @Override
    public Клон clone() throws CloneNotSupportedException {

        return (Клон) super.clone();
    }
}
