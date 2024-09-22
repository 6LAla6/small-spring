package com.awa.springframework;

/**
 * @Author: awa
 * @Description: TODO Bean定义
 * @DateTime: 2024/9/22 16:51
 **/

public class BeanDefinition {
    private Object bean;
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
