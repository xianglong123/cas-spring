package com.cas.config;

import com.cas.bean.Person;
import com.cas.bean.Red;
import com.cas.condition.BigCondition;
import com.cas.factory.ColorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/10 11:16 上午
 * @desc
 */
public class MainConfig2 {

    /**
     * 	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * 	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     *
     * 	 prototype: 多实例的
     * 	 singleton: 单实例的（默认值）：ioc容器启动会调用方法创建对象到ioc容器中。以后每次
     * 	 获取就是直接从容器（map.get()）中拿。
     *
     *   懒加载：
     *      单实例bean：默认在容器启动的时候创建对象
     *      容器启动的时候不会加载，只有在第一次使用的时候加载
     */
    // @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person() {
//        System.out.println("给容器中添加Person...");
        return new Person("张三", "26");
    }

    @Conditional(value = BigCondition.class)
    @Bean("xianglong")
    public Person xianglong() {
        return new Person("xianglong", "26");
    }

    @Bean("xl")
    public Person xl() {
        return new Person("xl", "26");
    }

    /**
     * 给容器中注册组件
     * 1、包扫描 + 组件标注注解（@controller/@Service/@Repository/@Componet）自己的项目
     * 2、@Bean[导入的第三方里面的组件]
     * 3、@Import[快速给容器中导入一个组件]
     * 4、FactoryBean<T></> 详情见ColorFactory（工厂Bean）
     *      1） 默认获取到的是工厂Bean调用getObject创建的对象
     *      2） 要获取工厂Bean本身，我们需要给id前面加一个 &
     *      &colorFactory
     *
     * 遍历得到容器中所有的BeanPostProcessor；挨个执行beforeInitialization
     * 一旦返回null，跳出for循环，不会执行后面的BeanPostProcessor
     *
     */

    @Bean
    public ColorFactory colorFactory() {
        return new ColorFactory();
    }

    @Bean
    public Red red() {
        return new Red();
    }

}
