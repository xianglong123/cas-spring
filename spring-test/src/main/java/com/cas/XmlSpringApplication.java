package com.cas;

import com.cas.aop.Rent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/9 3:18 下午
 * @desc
 */
public class XmlSpringApplication {

    public static void main(String[] args) {
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

        /**
        // 测试xml注入容器
        A a = context.getBean(A.class);
        System.out.println(a.getName());

        // 测试@Import
        B b = context.getBean(B.class);
        System.out.println(b.getName());
         */

        /**
         * Spring的动态代理代理的是接口,测试AOP
         */

        Rent rent = (Rent)context.getBean("host");
        rent.send();

    }

}
