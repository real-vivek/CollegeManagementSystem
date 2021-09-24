package com.university.pune;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DeanPostFactoryBeanProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("dean");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		propertyValues.addPropertyValue("deanName", "Dean Name from DeanPostFactoryBeanProcessor");
	}

}
