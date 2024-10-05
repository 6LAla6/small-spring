package com.awa.springframework.beans.factory;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/6 6:29
 **/
public interface FactoryBean<T> {
    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}

