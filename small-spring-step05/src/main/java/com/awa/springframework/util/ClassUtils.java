package com.awa.springframework.util;

/**
 * @Author: awa
 * @Description: TODO Class工具类
 * @DateTime: 2024/9/26 19:27
 **/
public class ClassUtils {

    /**
     * 获取默认类加载器
     * @return ClassLoader
     */
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader classLoader = null;
        try {
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (Throwable exception) {
            //  无法获取线程上下文类加载器
        }
        //  获取系统类加载器
        if (null == classLoader) {
            classLoader = ClassUtils.class.getClassLoader();
        }
        return classLoader;
    }

}
