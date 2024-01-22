package com.cas.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/12/22 5:03 下午
 * @desc
 */
public class SpringUtil implements BeanFactoryAware, ApplicationContextAware, EnvironmentAware, BeanClassLoaderAware, ResourceLoaderAware {

    private static BeanFactory beanFactory;
    private static ApplicationContext applicationContext;
    private static Environment environment;
    private static ClassLoader classLoader;
    private static ResourceLoader resourceLoader;

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

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        SpringUtil.classLoader = classLoader;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        SpringUtil.resourceLoader = resourceLoader;
    }
}
