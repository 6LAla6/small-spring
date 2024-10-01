package com.awa.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author: awa
 * @Description: TODO 默认资源加载器
 * @DateTime: 2024/9/26 20:05
 **/
public class DefaultResourceLoader implements ResourceLoader{

    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "location must not be null");
        //  ClassPath加载方式:
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            //  path去掉前缀
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        } else {
            try {
                //  URL加载方式
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                //  文件路径加载方式
                return new FileSystemResource(location);
            }
        }
    }

}
