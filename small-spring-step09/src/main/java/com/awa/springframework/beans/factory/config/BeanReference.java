package com.awa.springframework.beans.factory.config;

/**
 * @Author: awa
 * @Description: TODO-step04: Bean的引用
 * @DateTime: 2024/9/25 19:53
 **/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
