package com.cas.event;

import org.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-01-22 17:33
 **/
public class MyEvent extends ApplicationEvent {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
