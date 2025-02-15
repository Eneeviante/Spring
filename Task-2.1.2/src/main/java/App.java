import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHelloWorld_1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld beanHelloWorld_2 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat beanCat_1 = applicationContext.getBean("cat", Cat.class);
        Cat beanCat_2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(beanHelloWorld_1 == beanHelloWorld_2);
        System.out.println(beanCat_1 == beanCat_2);
    }
}