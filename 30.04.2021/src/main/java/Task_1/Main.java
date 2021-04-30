package Task_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String contextPath = ClassLoader.getSystemResource("contextTask1.xml").toString();
        ApplicationContext context = new ClassPathXmlApplicationContext(contextPath);

        System.out.println(context.getBean(Man.class).toString());
    }
}

class Man{
    String surname, name, patronymic;

    public Man(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initMethod(){
        patronymic = "patronymic";
    }

    @Override
    public String toString() {
        return "Man{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
