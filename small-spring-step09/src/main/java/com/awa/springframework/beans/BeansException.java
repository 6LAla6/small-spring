package com.awa.springframework.beans;

import com.awa.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: awa
 * @Description: TODO 定义Bean异常
 * @DateTime: 2024/9/22 21:07
 **/
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
