package Task_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        for (String str : applicationContext.getBeanDefinitionNames()){
            System.out.println(str);
        }
        System.out.println(applicationContext.getBean(Dog.class));
    }
}

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
