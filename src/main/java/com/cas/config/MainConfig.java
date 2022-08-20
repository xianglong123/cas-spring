package com.cas.config;

import com.cas.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/10 9:59 上午
 * @desc
 */
@Configuration
@ComponentScan(value = "com.cas", includeFilters = {
        // 排除注解Service的类注入IOC容器
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
}, useDefaultFilters = false)
// @ComponentScan value:指定要扫描的包
// excludeFilters = Filter[] , 指定扫描的时候按照什么规则排除那些组件
// includFilters = Filter[] , 指定扫描的时候只需要包含哪些组件
// FilterType.ANNOTATION , 按照注解
// FilterType.ASSIGNABLE_TYPE , 按照指定类型
// FilterType.CUSTOM , 指定规则
public class MainConfig {

    /**
     * 给容器注册一个Bean， id默认为方法名
     * > Task :compileTestJava
     * > Task :processTestResources NO-SOURCE
     * > Task :testClasses
     *
     * > Task :MainConfigTest.main()
     * Person{name='xl', age='24'}
     * 1234
     *
     * BUILD SUCCESSFUL in 1s
     * 4 actionable tasks: 3 executed, 1 up-to-date
     * 10:07:14 上午: Task execution finished 'MainConfigTest.main()'.
     */
    @Bean(value = "1234")
    public Person person01() {
        return new Person("xl", "24");
    }

}
