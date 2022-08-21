package com.cas;

import com.cas.bean.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/9 3:18 下午
 * @desc
 */
@ComponentScan("com.cas")
public class XmlSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        A a = (A) context.getBean("a");
        System.out.println(a.getName());
    }

}
