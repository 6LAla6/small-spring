package com.awa.springframework.core.io;

/**
 * @Author: awa
 * @Description: TODO 获取资源接口
 * @DateTime: 2024/9/26 20:02
 **/
public interface ResourceLoader {

    /**
     * ClassPath前缀
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
