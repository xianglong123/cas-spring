package com.cas.event;

import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("Received my event - " + event.getMessage());
    }
}