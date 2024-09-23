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
        //  bean已存在直接返回
        Object bean = getSingleton(name);
        if (null != bean) {
            return bean;
        }
        //  不存在, 注册bean并返回
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;


}
