package com.cas.config;

import com.cas.service.UserServiceImpl;
import org.springframework.beans.factory.BeanClassLoaderAware;

/**
 * @description:
 * @author: xianglong
 * @create: 2024-01-23 17:44
 **/
public class MyBeanClassLoaderAware implements BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void loadAndExecute() {
        try {
            Class<?> clazz = classLoader.loadClass("com.cas.service.UserServiceImpl");
            UserServiceImpl userService = (UserServiceImpl) clazz.getDeclaredConstructor().newInstance();
            System.out.println(userService.getUserInfo());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
