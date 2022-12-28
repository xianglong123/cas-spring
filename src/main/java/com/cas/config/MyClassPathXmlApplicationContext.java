package com.cas.config;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/12/26 4:46 下午
 * @desc 自定义上下文类
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        System.out.println("扩展initPropertySources");
        super.initPropertySources();
        getEnvironment().setRequiredProperties("username");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.setAllowBeanDefinitionOverriding(false);
        super.setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory);
    }
}
