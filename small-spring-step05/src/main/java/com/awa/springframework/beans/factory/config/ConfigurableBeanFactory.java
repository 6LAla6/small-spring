package com.awa.springframework.beans.factory.config;

import com.awa.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/28 19:22
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";
}
