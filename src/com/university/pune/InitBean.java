package com.university.pune;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

// Example of BeanPostProcessor using Annotation Configuration
@Component
public class InitBean implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization from BeanPostProcessor : " + beanName);
		return bean; 
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInitialization from BeanPostProcessor : " + beanName);
		return bean;
	}
}
