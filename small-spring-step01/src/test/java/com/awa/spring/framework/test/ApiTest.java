package com.awa.spring.framework.test;

import com.awa.springframework.BeanDefinition;
import com.awa.springframework.BeanFactory;
import org.junit.Test;

/**
 * @Author: awa
 * @Description: TODO Bean定义、注册、获取测试
 * @DateTime: 2024/9/22 17:02
 **/
public class ApiTest {

    @Test
    public void test_Bean() {
        //  初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        //  定义Bean并注册
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //  获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.query();
    }

}
