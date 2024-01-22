package com.cas.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/8/21 10:14 下午
 * @desc
 */
public class LogBeanFactoryPostProcess implements BeanFactoryPostProcessor, PriorityOrdered {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("LogBeanFactoryPostProcess 被调用");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
