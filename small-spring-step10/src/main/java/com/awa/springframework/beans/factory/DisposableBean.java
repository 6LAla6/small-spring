package com.awa.springframework.beans.factory;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/4 7:31
 **/
public interface DisposableBean {
    void destroy() throws Exception;
}
