package com.cas.config;

import com.cas.registrar.HelloImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/14 6:23 下午
 * @desc
 */
@Configuration
@ComponentScan("com.cas")
@Import(HelloImportBeanDefinitionRegistrar.class)
public class HelloConfiguration {

}
