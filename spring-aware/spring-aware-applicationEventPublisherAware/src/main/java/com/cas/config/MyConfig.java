package com.cas.config;

import com.cas.event.MyEventListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-01-22 17:35
 **/
@Configuration
public class MyConfig {

    @Bean
    public MyApplicationEventPublisherAware publisherAware() {
        return new MyApplicationEventPublisherAware();
    }

    @Bean
    public MyEventListener listener() {
        return new MyEventListener();
    }

}
