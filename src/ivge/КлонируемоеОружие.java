package ivge;

public class КлонируемоеОружие implements Cloneable, Оружие {
    private String name;

    public КлонируемоеОружие(String name) {
        this.name = name;
    }

    @Override
    public Оружие clone() throws CloneNotSupportedException {
        System.out.println("Клонирую оружие");
        return (Оружие) super.clone();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

