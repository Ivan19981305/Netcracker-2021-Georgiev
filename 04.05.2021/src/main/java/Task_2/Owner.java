package Task_2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
public class Owner {
    String name;

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {

    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
