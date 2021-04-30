package Task_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String contextPath = ClassLoader.getSystemResource("context.xml").toString();
        ApplicationContext context = new ClassPathXmlApplicationContext(contextPath);

        context.getBean(Man.class);
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
}
