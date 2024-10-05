package com.awa.springframework.beans.factory.support;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author: awa
 * @Description: TODO 负责Bean实例化
 * @DateTime: 2024/9/23 19:25
 **/
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
