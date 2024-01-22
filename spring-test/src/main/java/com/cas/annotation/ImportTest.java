package com.cas.annotation;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/12/28 2:20 下午
 * @desc 看这篇源码解析：https://blog.csdn.net/qq_36963950/article/details/107621283
 */
@Import({ImportTest.class})
public class ImportTest implements ImportSelector, DeferredImportSelector, ImportBeanDefinitionRegistrar {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("hello world, ImportTest");
        // 可以通过这种方式优先加载实例
        return new String[] {"com.cas.bean.B", "com.cas.bean.A"};
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

    }


    @Override
    public Class<? extends Group> getImportGroup() {
        return null;
    }
}
