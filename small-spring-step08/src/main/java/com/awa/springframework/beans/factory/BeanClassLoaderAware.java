package com.awa.springframework.beans.factory;

import com.awa.springframework.beans.BeansException;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/5 15:29
 **/
public interface BeanClassLoaderAware extends Aware{
    void setBeanClassLoader(ClassLoader classLoader);
}
