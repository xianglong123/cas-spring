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