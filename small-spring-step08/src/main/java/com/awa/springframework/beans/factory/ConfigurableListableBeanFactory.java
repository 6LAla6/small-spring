package com.awa.springframework.beans.factory;


import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.awa.springframework.beans.factory.config.BeanDefinition;
import com.awa.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
