package com.awa.springframework.beans.factory.config;

import com.awa.springframework.beans.PropertyValues;

/**
 * @Author: awa
 * @Description: TODO Bean定义
 * @DateTime: 2024/9/22 17:56
 **/
public class BeanDefinition {
    //  TODO-step03 Object -> Class: 在容器中处理Bean的实例化, 而不是BeanDefinition的初始化调用阶段
    private Class beanClass;

    //  TODO-step04: 新增Bean属性值集合
    private PropertyValues propertyValues;

    private String initMethodName;
    private String destroyMethodName;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }
}
