package com.awa.springframework.beans.factory;

import com.awa.springframework.beans.BeansException;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/4 7:29
 **/
public interface InitializingBean {

    /**
     * Bean处理完属性填充后调用
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
