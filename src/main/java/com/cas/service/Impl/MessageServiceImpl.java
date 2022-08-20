package com.cas.service.Impl;

import com.cas.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/8/9 3:20 下午
 * @desc
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "hello world";
    }
}
