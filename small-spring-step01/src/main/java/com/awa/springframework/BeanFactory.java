package com.awa.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: awa
 * @Description: TODO Bean工厂: 注册定义的Bean
 * @DateTime: 2024/9/22 16:54
 **/
public class BeanFactory {
    //  Bean存放到ConcurrentHashMap
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    //  BeanName获取Bean对象
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    //  Bean注册到Map容器
    public void registerBeanDefinition(String name, BeanDefinition bean) {
        beanDefinitionMap.put(name, bean);
    }

}
