package com.cas.factory;


import com.cas.bean.Bule;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/10 9:17 下午
 * @desc
 */
public class ColorFactory implements FactoryBean<Bule> {

    @Override
    public Bule getObject() throws Exception {
        return new Bule();
    }

    @Override
    public Class<?> getObjectType() {
        return Bule.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
