package com.cas;

import com.cas.config.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextAwareApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    }
}
