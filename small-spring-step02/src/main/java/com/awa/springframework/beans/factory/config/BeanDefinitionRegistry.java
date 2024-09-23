package com.awa.springframework.beans.factory.config;

/**
 * @Author: awa
 * @Description: TODO 注册BeanDefinition
 * @DateTime: 2024/9/22 20:27
 **/
public interface BeanDefinitionRegistry {
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
