package Task_2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String contextPath = ClassLoader.getSystemResource("context.xml").toString();
        ApplicationContext context = new ClassPathXmlApplicationContext(contextPath);

        System.out.println(context.getBean(Task_2.MyClass.class));

        System.out.println(context.getBean(Task_2.MyClass.class));
    }
}

class MyClass{
    Integer integer;

    public MyClass() {
        Random random = new Random();
        integer = random.nextInt();
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "integer=" + integer +
                '}';
    }
}
