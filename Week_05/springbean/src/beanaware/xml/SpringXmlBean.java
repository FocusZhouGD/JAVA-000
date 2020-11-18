package beanaware.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlBean {
    public static void main(String[] args) {
      //不使用spring的 平时实例对象 需要创建
        /**
        User user =new User();
        user.setId(1);
        user.setAge(10);
        user.setName("我是自己实例出来的");
        System.out.println(user.toString());
        **/
        //使用spring 自动装配 xml形式
        ApplicationContext context =new ClassPathXmlApplicationContext("spring-config.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());


    }
}
