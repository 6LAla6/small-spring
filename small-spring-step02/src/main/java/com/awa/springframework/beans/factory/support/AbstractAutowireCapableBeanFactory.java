package com.awa.springframework.beans.factory.support;

import com.awa.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author: awa
 * @Description: TODO 实现实例化Bean方法
 * @DateTime: 2024/9/22 20:15
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        //  实例化Bean
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        //  添加单例Bean对象
        addSingleton(beanName, bean);
        return bean;
    }

}
