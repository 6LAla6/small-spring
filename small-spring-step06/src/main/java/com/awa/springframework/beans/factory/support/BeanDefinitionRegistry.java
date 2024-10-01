package com.awa.springframework.beans.factory.support;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author: awa
 * @Description: TODO 注册BeanDefinition
 * @DateTime: 2024/9/22 20:27
 **/
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 判断是否包含指定名称的BeanDefinition
     *
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     * <p>
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
