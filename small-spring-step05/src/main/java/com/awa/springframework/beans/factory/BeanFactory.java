package com.awa.springframework.beans.factory;

import com.awa.springframework.beans.BeansException;

/**
 * @Author: awa
 * @Description: TODO Bean工厂,负责生产Bean对象
 * @DateTime: 2024/9/22 18:28
 **/
public interface BeanFactory {
    //  注入只有默认构造器的Class
    Object getBean(String name) throws BeansException;

    //  注入有构造器的Class
    Object getBean(String name, Object... args) throws BeansException;

}
