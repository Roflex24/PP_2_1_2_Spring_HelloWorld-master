import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBeanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBeanOne.getMessage());

        HelloWorld helloWorldBeanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldBeanTwo.getMessage());

        Cat catBeanOne =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanOne.getMessage());

        Cat catBeanTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanTwo.getMessage());

        System.out.println(helloWorldBeanOne == helloWorldBeanTwo);
        System.out.println(catBeanOne == catBeanTwo);
    }
}