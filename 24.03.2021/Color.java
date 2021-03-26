package ivge;

import java.util.Objects;

public class Color implements Cloneable{
    private int id;
    private String name;

    public Color(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Color clone() throws CloneNotSupportedException {
        return (Color) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return id == color.id &&
                Objects.equals(name, color.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
