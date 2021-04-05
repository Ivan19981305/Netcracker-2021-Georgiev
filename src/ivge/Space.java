package ivge;

import java.util.Arrays;

public class Space {
    public String name;
    private Integer[] coordinates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Integer[] coordinates) {
        this.coordinates = coordinates;
    }

    private void hide()
    {
        System.out.println("I'm hiding");
    }

    public void dropSpace()
    {
        this.setName(null);
        this.setCoordinates(null);
    }

    @Override
    public String toString() {
        return "Space{" +
                "name='" + name + '\'' +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
