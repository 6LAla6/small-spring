package com.awa.springframework.beans.factory.config;

/**
 * @Author: awa
 * @Description: TODO Bean定义
 * @DateTime: 2024/9/22 17:56
 **/
public class BeanDefinition {
    //  TODO Object -> Class: 在容器中处理Bean的实例化, 而不是BeanDefinition的初始化调用阶段
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

}
