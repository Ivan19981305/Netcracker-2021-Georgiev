package Task_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    Owner owner;
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "owner=" + owner +
                ", name='" + name + '\'' +
                '}';
    }

    public Owner getOwner() {
        return owner;
    }

    @Autowired
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
