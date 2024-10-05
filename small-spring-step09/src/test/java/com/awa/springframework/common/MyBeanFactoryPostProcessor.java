package com.awa.springframework.common;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.PropertyValue;
import com.awa.springframework.beans.PropertyValues;
import com.awa.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.awa.springframework.beans.factory.config.BeanDefinition;
import com.awa.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}