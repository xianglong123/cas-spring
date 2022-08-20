package com.cas.test;

import com.cas.bean.Person;
import com.cas.config.HelloConfiguration;
import com.cas.config.MainConfig;
import com.cas.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/10 10:37 上午
 * @desc
 */
public class IOCTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);


    @Test
    public void test05() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloConfiguration.class);
        Object helloService = applicationContext.getBean("helloService");
        System.out.println(helloService.getClass());
    }

    @Test
    public void test04() {
        print();
        Object colorFactory = applicationContext.getBean("colorFactory");
        System.out.println(colorFactory.getClass());

        // 前缀加一个一个&能拿到真正的BeanFactory
        Object colorFactory2 = applicationContext.getBean("&colorFactory");
        System.out.println(colorFactory2.getClass());
    }

    private void print() {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test03() {
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        // 获取操作系统名
        String property = environment.getProperty("os.name");
        System.out.println("os.name -----> " + property);

        for (String name : names) {
            System.out.println(name);
        }

        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

        System.out.println("ioc容器创建完成...");
        Object person = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        System.out.println(person == person2);
    }

    @Test
    @SuppressWarnings("resource")
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

}
