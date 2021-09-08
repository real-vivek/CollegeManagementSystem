package com.university.pune;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUsingAnnotationConfig {

	public static void main(String[] args) {
		// Loading the spring configuration file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContextForAnnotationConfig.xml");

		// Retrieving bean from spring container
		College bean = (College) classPathXmlApplicationContext.getBean("symbiosisCollege");

		// Calling methods on bean
		System.out.println(bean.getStreamsOffered());

		// Closing the context
		classPathXmlApplicationContext.close();
		
		
	}
}
