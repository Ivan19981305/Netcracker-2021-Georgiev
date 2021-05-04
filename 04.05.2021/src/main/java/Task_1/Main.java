package Task_1;

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
        System.out.println(applicationContext.getBean(Test.class).getName());
    }
}

@Configuration
class JavaConfig{

    @Bean
    public Test mainCharacter(){
        Test test = new Test();
        test.setName("Test 1");
        return test;
    }
}
