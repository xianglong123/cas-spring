package com.cas.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/8/21 10:14 下午
 * @desc
 */
public class LogBeanFactoryPostProcess implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory 被调用");
    }
}
