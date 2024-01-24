package com.cas.config;

import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-01-23 17:45
 **/
public class MyConfiguration {

    @Bean
    public MyBeanClassLoaderAware myBeanClassLoaderAware() {
        return new MyBeanClassLoaderAware();
    }

}
