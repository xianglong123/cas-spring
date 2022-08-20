package com.cas;

import com.cas.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/9 3:18 下午
 * @desc
 */
public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

        System.out.println("context 启动成功");

        MessageService messageService = context.getBean(MessageService.class);

        System.out.println(messageService.getMessage());

    }

}
