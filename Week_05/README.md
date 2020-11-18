学习笔记

spring bean 生命周期

1)创建对象
2)属性赋值
3)初始化
4)注销接口注册


bean 加载的过程

问题一
xml什么时候创建了对象类的实例并对字段赋值了吗？

准备工作：
   1.在构造函数中打印一句话 2. setXXX 打印语句  3. 在增加一个类
   
结果证明：
    ApplicationContext context =new ClassPathXmlApplicationContext("spring-config.xml");
    执行完后就已经创建了实例 我们只需在容器中获取可以
   
   
            //使用注解的形式
           //ApplicationContext context =new AnnotationConfigApplicationContext(AnotationConfig.class);
           //这种形式也是可以的   @ComponentScan扫描到AnotationConfig这个类标记一下 需要装配的bean
           ApplicationContext context =new AnnotationConfigApplicationContext(UserAnotation.class);
           
           这种其实我们直接从ApplicationContext容器中取到bean
常用的bean装配 有xml 和 注解 还有@Autowired,@Resource 
@Autowired 按照类的类型装配bean
@Resource  按照类的名称装配bean        

@Resource("类的名字小写")

@Qualifier 限定符 场景就是 一个interface 多个实现 （指定 名字小写)明确是哪一个实现类

           