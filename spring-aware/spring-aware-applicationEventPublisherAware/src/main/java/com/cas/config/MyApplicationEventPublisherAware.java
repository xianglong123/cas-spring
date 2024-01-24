package com.cas.config;

import com.cas.event.MyEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-01-22 17:26
 **/
public class MyApplicationEventPublisherAware implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(String message) {
        publisher.publishEvent(new MyEvent(this, message));
    }

}
