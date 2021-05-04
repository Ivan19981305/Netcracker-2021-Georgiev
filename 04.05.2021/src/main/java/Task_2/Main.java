package Task_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        String contextPath = ClassLoader.getSystemResource("context.xml").toString();
        ApplicationContext context = new ClassPathXmlApplicationContext(contextPath);
        for (String str : context.getBeanDefinitionNames()){
            System.out.println(str);
        }
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Owner.class));
        /*
        Dog{owner=null, name='DOGE'}
        Owner{name='null'}
         */
    }
}

/*
@Configuration
class JavaConfig{

    @Bean
    public Owner mainCharacter(){
        Owner owner = new Owner();
        owner.setName("Owner 1");
        return owner;
    }

    @Bean
    public Dog mainDog(){
        Dog dog = new Dog();
        dog.setName("Dog 1");
        return dog;
    }
}
 */

