package com.cas.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/12/22 5:03 下午
 * @desc
 */
public class SpringUtil implements BeanFactoryAware, ApplicationContextAware, EnvironmentAware {

    private static BeanFactory beanFactory;
    private static ApplicationContext applicationContext;
    private static Environment environment;

    public static <T> T getBean(Class<T> clazz) {
        return beanFactory != null ? beanFactory.getBean(clazz) : applicationContext.getBean(clazz);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        SpringUtil.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.applicationContext = applicationContext;
    }

    @Override
    public void setEnvironment(Environment environment) {
        SpringUtil.environment = environment;
    }

}
