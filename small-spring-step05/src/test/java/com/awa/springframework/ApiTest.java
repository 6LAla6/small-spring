package com.awa.springframework;

import cn.hutool.core.io.IoUtil;
import com.awa.springframework.bean.UserDao;
import com.awa.springframework.bean.UserService;
import com.awa.springframework.beans.PropertyValue;
import com.awa.springframework.beans.PropertyValues;
import com.awa.springframework.beans.factory.config.BeanDefinition;
import com.awa.springframework.beans.factory.config.BeanReference;
import com.awa.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.awa.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.awa.springframework.core.io.DefaultResourceLoader;
import com.awa.springframework.core.io.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/9/22 20:33
 **/
public class ApiTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_url() throws IOException {
        Resource resource = resourceLoader.getResource("https://github.com/fuzhengwei/small-spring/blob/main/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_xml() {
        //  1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //  2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        //  3. 获取Bean对象调用方法
        UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
        String result = userService.query();
        System.out.println("测试结果: " + result);
    }

}
