package com.awa.springframework.beans.factory.config;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author: awa
 * @Description: TODO 允许自定义修改 BeanDefinition 属性信息
 * @DateTime: 2024/10/2 17:23
 **/
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的BeanDefinition加载完成后, 实例化Bean对象之前,
     * 提供修改BeanDefinition的机制
     * @param beanFactory bean工厂
     * @throws BeansException Bean异常
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
