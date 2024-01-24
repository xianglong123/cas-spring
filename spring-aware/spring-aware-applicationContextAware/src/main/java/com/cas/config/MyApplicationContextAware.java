package com.cas.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 如果你想在创建对象的时候，访问上下文，可以实现ApplicationContextAware，会自动调用setApplicationContext方法
 */
public class MyApplicationContextAware implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("实现ApplicationContextAware接口,自动调用setApplicationContext方法");
        System.out.println("ApplicationContext = " + context);
    }
}
