package com.cas.annotation;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2022/12/28 11:26 上午
 * @desc
 */
@Service
public class ServiceTest implements Ordered {

    @Override
    public int getOrder() {
        return 1;
    }
}
