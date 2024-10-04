package com.awa.springframework.beans.factory.support;

import com.awa.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: awa
 * @Description: TODO 实现获取单例Bean方法, 新增protected添加单例Bean方法
 * @DateTime: 2024/9/22 18:16
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjectMap = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        return singletonObjectMap.get(name);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjectMap.put(beanName, singletonObject);
    }


}
