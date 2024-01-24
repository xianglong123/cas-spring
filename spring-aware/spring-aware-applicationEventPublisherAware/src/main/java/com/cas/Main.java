package com.cas;

import com.cas.config.MyApplicationEventPublisherAware;
import com.cas.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: ${description}
 * @author: xianglong
 * @create: ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyApplicationEventPublisherAware bean = context.getBean(MyApplicationEventPublisherAware.class);
        bean.publish("Hello world!");
    }
}