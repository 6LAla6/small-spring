package com.awa.springframework.beans.factory.support;

import com.awa.springframework.core.io.DefaultResourceLoader;
import com.awa.springframework.core.io.ResourceLoader;

/**
 * @Author: awa
 * @Description: TODO 加载Bean定义抽象类
 * @DateTime: 2024/9/26 20:15
 **/
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry registry;
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
