package com.awa.springframework.beans.factory.config;

import com.awa.springframework.beans.BeansException;

/**
 * @Author: awa
 * @Description: TODO 用于修改新实例化 Bean 对象的扩展点
 * @DateTime: 2024/10/3 15:26
 **/
public interface BeanPostProcessor {

    /**
     * bean初始化之前执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * bean初始化之后执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
