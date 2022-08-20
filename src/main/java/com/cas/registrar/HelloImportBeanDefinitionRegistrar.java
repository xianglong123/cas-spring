package com.cas.registrar;

import com.cas.service.HelloService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;

import java.util.Map;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/14 6:17 下午
 * @desc
 */
public class HelloImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 扫描注解
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());

        String[] packages = (String[]) annotationAttributes.get("basePackages");

        // 扫描类
        ClassPathBeanDefinitionScanner scanner =
                new ClassPathBeanDefinitionScanner(registry, false);
        AssignableTypeFilter helloServiceFilter = new AssignableTypeFilter(HelloService.class);

        scanner.addIncludeFilter(helloServiceFilter);
        scanner.scan(packages);
    }

}
