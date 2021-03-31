package ivge;

import java.util.Objects;

public class FreeSoftArt {
    private final String artName;

    public FreeSoftArt(String artName) {
        this.artName = artName;
    }

    @Override
    public String toString() {
        return "FreeSoftArt{" +
                "artName='" + artName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FreeSoftArt that = (FreeSoftArt) o;
        return artName.equals(that.artName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artName);
    }
}