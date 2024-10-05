package com.awa.springframework.beans.factory;

import com.awa.springframework.beans.BeansException;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/5 15:28
 **/
public interface BeanFactoryAware extends Aware{
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
