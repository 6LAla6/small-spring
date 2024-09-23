package com.awa.springframework;

import com.awa.springframework.bean.UserService;
import com.awa.springframework.beans.factory.config.BeanDefinition;
import com.awa.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/22 20:33
 **/
public class ApiTest {

    @Test
    public void test() {
        //  1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //  注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //  第一次获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService", "awalalala");
        userService.query();
    }

}
