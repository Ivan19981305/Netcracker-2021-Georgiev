package ivge;

public class НеКлонируемоеОружие implements Оружие {
    private String name;

    public НеКлонируемоеОружие(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

