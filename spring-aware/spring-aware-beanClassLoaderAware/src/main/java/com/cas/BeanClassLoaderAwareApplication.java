package com.cas;

import com.cas.config.MyBeanClassLoaderAware;
import com.cas.config.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: ${description}
 * @author: xianglong
 * @create: ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
 **/
public class BeanClassLoaderAwareApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyBeanClassLoaderAware bean = context.getBean(MyBeanClassLoaderAware.class);
        bean.loadAndExecute();
    }
}