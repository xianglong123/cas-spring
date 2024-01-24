package com.cas;

import com.cas.config.MyConfiguration;
import com.cas.config.MyEmbeddedValueResolverAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xcs
 * @date 2023年09月16日 16时09分
 **/
public class EmbeddedValueResolverAwareApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyEmbeddedValueResolverAware resolverAware = context.getBean(MyEmbeddedValueResolverAware.class);
        resolverAware.resolve();
    }
}
