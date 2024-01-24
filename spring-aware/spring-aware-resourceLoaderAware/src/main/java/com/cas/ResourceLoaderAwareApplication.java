package com.cas;

import com.cas.config.MyConfiguration;
import com.cas.config.MyResourceLoaderAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xcs
 * @date 2023年09月16日 16时09分
 **/
public class ResourceLoaderAwareApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyResourceLoaderAware resourceLoaderAware = context.getBean(MyResourceLoaderAware.class);
        resourceLoaderAware.getResource("classpath:xcs.txt");
    }
}
