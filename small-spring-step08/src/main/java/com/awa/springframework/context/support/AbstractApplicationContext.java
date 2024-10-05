package com.awa.springframework.context.support;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.awa.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.awa.springframework.beans.factory.config.BeanPostProcessor;
import com.awa.springframework.context.ConfigurableApplicationContext;
import com.awa.springframework.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * @Author: awa
 * @Description: TODO 抽象应用上下文
 * @DateTime: 2024/10/3 15:41
 **/
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    @Override
    public void refresh() throws BeansException {
        //  1. 创建BeanFactory, 并加载BeanDefinition
        refreshBeanFactory();

        //  2. 获取BeanFactory
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();

        //  3. 在Bean实例化之前, 执行BeanFactoryPostProcessor
        //  ( (invoke)调用上下文中注册为bean的工厂处理器 )
        invokeBeanFactoryPostProcessors(beanFactory);

        //  4. BeanPostProcessor需要在所有Bean实例化之前进行注册操作
        invokeBeanPostProcessors(beanFactory);
    }

    protected abstract void refreshBeanFactory() throws  BeansException;

    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    /**
     * 获取所有处理器, 执行一边
     * @param beanFactory
     */
    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()) {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }

    /**
     * 注册所有BeanPostProcessor
     * @param beanFactory
     */
    private void invokeBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return getBeanFactory().getBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    @Override
    public void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(this::close));
    }

    @Override
    public void close() {
        getBeanFactory().destroySingletons();
    }
}
