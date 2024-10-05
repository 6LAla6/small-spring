package com.awa.springframework.context;

import com.awa.springframework.beans.BeansException;
import com.awa.springframework.beans.factory.Aware;
import com.awa.springframework.context.ApplicationContext;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/5 15:31
 **/
public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
