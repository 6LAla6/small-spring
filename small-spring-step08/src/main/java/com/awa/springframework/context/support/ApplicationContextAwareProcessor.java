package com.awa.springframework.context.support;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.config.BeanPostProcessor;
import com.awa.springframework.context.ApplicationContext;
import com.awa.springframework.context.ApplicationContextAware;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/5 15:33
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
