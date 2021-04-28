import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String contextPath = ClassLoader.getSystemResource("context.xml").toString();
        ApplicationContext context = new ClassPathXmlApplicationContext(contextPath);
        context.getBean("service2", Service2.class).print();
    }
}
