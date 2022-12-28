package com.cas;

import com.cas.bean.A;
import com.cas.bean.B;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

        A a = context.getBean(A.class);
        System.out.println(a.getName());

        B b = context.getBean(B.class);
        System.out.println(b.getName());
    }

}
