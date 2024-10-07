package com.awa.springframework.beans.factory;

import com.awa.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/28 19:36
 **/
public interface ListableBeanFactory extends BeanFactory{
    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
