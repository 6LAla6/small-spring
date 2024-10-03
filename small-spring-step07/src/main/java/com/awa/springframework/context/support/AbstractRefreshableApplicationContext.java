package com.awa.springframework.context.support;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.awa.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/3 16:07
 **/
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        //  获取DefaultListableBeanFactory实例
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        //  加载BeanDefinition
        loadBeanDefinition(beanFactory);
        this.beanFactory = beanFactory;
    }

    protected abstract void loadBeanDefinition(DefaultListableBeanFactory beanFactory);

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
