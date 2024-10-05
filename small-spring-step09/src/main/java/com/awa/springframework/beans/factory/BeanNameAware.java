package com.awa.springframework.beans.factory;

import com.awa.springframework.beans.factory.Aware;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/5 15:30
 **/
public interface BeanNameAware extends Aware {
    void setBeanName(String beanName);
}
