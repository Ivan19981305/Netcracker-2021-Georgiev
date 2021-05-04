package Task_2;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;

public class Dog {
    Owner owner;
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Lazy
    public Dog(Owner owner) {
        this.owner = owner;
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


    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
}
