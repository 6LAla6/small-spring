package com.awa.springframework.context.support;

import com.awa.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.awa.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author: awa
 * @Description: TODO
 * @DateTime: 2024/10/3 16:12
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinition(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
