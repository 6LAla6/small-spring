package com.awa.springframework.beans.factory.support;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.BeanFactory;
import com.awa.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: awa
 * @Description: TODO 实现获取单例Bean
 * @DateTime: 2024/9/22 18:25
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException{
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        //  bean已存在直接返回
        Object bean = getSingleton(name);
        if (null != bean) {
            return (T) bean;
        }
        //  不存在, 注册bean并返回
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;


}
