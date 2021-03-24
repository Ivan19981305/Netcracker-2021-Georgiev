package ivge;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        КлонируемоеОружие клонируемоеОружие = new КлонируемоеОружие("что-то старое");
        Клон боббаФет = new Клон("зеленый", клонируемоеОружие, 1);
        Клон клон = боббаФет.clone();
        клонируемоеОружие.setName("что-то новое");
        System.out.println(боббаФет.getОружие().getName());
        System.out.println(клон.getОружие().getName());

    }
}
