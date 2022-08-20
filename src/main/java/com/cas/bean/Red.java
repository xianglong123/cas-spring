package com.cas.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/11 3:31 下午
 * @desc
 */
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String name : beanNamesForType) {
            System.out.println("容器加载的Bean ====> " + name);
        }
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }


    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println(resolver.resolveStringValue("你好 ${os.name}, age = #{20 + 4}"));
    }
}
