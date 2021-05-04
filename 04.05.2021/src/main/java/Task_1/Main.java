package Task_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        for (String str : applicationContext.getBeanDefinitionNames()){
            System.out.println(str);
        }
    }
}

@Configuration
class JavaConfig{

    @Bean
    @Lazy
    public Test mainCharacter(){
        Test test = new Test();
        test.setName("Test 1");
        return test;
    }
}
