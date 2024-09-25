package com.awa.springframework;

import com.awa.springframework.bean.UserDao;
import com.awa.springframework.bean.UserService;
import com.awa.springframework.beans.PropertyValue;
import com.awa.springframework.beans.PropertyValues;
import com.awa.springframework.beans.factory.config.BeanDefinition;
import com.awa.springframework.beans.factory.config.BeanReference;
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
        //  2. userDao注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        //  3. 设置属性值PropertyValue
        PropertyValues propertyValues = new PropertyValues();
//        propertyValues.addPropertyValue(new PropertyValue("id", "01"));
//        propertyValues.addPropertyValue(new PropertyValue("name", "awalalala"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        //  4. UserService注册
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //  5. UserService获取Bean
        //  UserService.getBean(String name) 报错原因:
        //  UserService有有参构函数, 但是存储在propertyValues中,所以getBean没有添加args
        //  在扫描UserService的构造函数的时候, args为null
        //  导致java.lang.IllegalArgumentException: Superclass has no null constructors but no arguments were given
//        UserService userService = (UserService) beanFactory.getBean("userService");
        UserService userService = (UserService) beanFactory.getBean("userService", "awalalala", "01");
        userService.query();
    }

}
