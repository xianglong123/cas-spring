## Bean的生命周期
    populateBean 给Bean进行属性赋值
    initializeBean
    {
        applyBeanPostProcessorsBeforeInitialization
        invokeInitMethods
        applyBeanPostProcessorsAfterInitialization
    }
    1、Bean进行属性赋值
    2、后置before
    3、初始化方法
    4、后置after
    5、销毁方法

## @Qualifier()
    使用此注解需要装配组件的id,而不是使用属性名

## @Primary
    让Spring进行自动装配的时候，默认使用首选的Bean，优先级没有@Qualifier高

## @Resource ｜ @Autowired
    @Resource 默认按照组件名称进行装配的，不能支持@Primary 是Java的原生注解
    @Autowired 是spring的注解
    AutowireAnnotationBeanPostProcessor: 解析完成自动装配功能
    
## @Bean
    @Bean 标注的方法创建对象的时候，方法参数的值从容器中获取
    
    @Bean
    public Person person(Xl xl) {
    // 这里的xl就是从容器中获取的
    return new Person()
    }

### @ConditionalOnProperty(prefix = "spring.aop", name = "auto", havingValue = "true", matchIfMissing = true)
    解释： 在配置文件中获取前缀为spring.aop的属性，并在其之下找到auto这个属性，如果属性是true那么注入Bean到容器中
          matchIfMissing = true 如果前面的配置不存在，默认是true，就是要注入此Bean
          
### @AliasFor
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @Documented
    public @interface AliasFor {
        // AliasFor别名
    	@AliasFor("attribute")
    	String value() default "";
    	
    	@AliasFor("value")
    	String attribute() default "";
    	
    	// 能为继承的对象起别名
    	Class<? extends Annotation> annotation() default Annotation.class;
    }
    
### spring类加载过程
    1、初始化 AnnotationConfigApplicationContext{AnnotatedBeanDefinitionReader[reader] + ClassPathBeanDefinitionScanner[scanner]}
    2、注册组件到 reader
        2.1 会调父类方法给属性赋值 AbstractBeanDefinition(beanClass)
        
## 组件
    1、ApplicationContextAware 实现拥有spring上下文
    当一个类实现了这个接口之后，这个类就可以方便的获得ApplicationContext对象（spring上下文），Spring发现某个Bean实现了ApplicationContextAware接口，Spring容器会在创建该Bean之后，自动调用该Bean的setApplicationContext（参数）方法，调用该方法时，会将容器本身ApplicationContext对象作为参数传递给该方法。
    
    2、FactoryBean 作用提供规范统一的实例创建过程
    
### 容器和对象的创建流程
    1、先创建容器
    2、加载配置文件文件，封装成BeanDefinition
    3、调用执行BeanFactoryPostProcessor
    准备工作
        准备beanPostProcessor
        准备监听器、事件、广播器
    4、实例化
    5、初始化
    6、获取到完整对象
    
![白女票de图](.README_images/10603292.png)
    
    
    
    
    
    
    
     