package beanaware.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnotationBean {
    public static void main(String[] args) {
        //使用注解的形式
        //ApplicationContext context =new AnnotationConfigApplicationContext(AnotationConfig.class);
        //这种形式也是可以的   @ComponentScan扫描到AnotationConfig这个类标记一下 需要装配的bean
        ApplicationContext context =new AnnotationConfigApplicationContext(UserAnotation.class);

        UserAnotation userAnotation = context.getBean("userAnotation", UserAnotation.class);
        System.out.println(userAnotation.toString());
    }
}
