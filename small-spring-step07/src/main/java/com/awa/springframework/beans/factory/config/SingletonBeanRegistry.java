package com.awa.springframework.beans.factory.config;

/**
 * @Author: awa
 * @Description: TODO 获取单例Bean
 * @DateTime: 2024/9/22 18:13
 **/
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
