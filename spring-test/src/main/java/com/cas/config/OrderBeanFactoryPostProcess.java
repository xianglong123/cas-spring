package com.cas.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/8/21 10:14 下午
 * @desc
 */
public class OrderBeanFactoryPostProcess implements BeanFactoryPostProcessor, Ordered {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("OrderBeanFactoryPostProcess 被调用");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
