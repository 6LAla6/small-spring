package com.awa.springframework.context;

import com.awa.springframework.beans.BeansException;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/3 15:36
 **/
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
