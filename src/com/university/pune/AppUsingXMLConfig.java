package com.university.pune;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUsingXMLConfig {

	public static void main(String[] args) {
		
		// Loading the spring configuration file
		// The applicationContextForXMLConfig.xml file should be in the class path
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContextForXMLConfig.xml");
		
		// Retrieving bean from spring container
		// In the line below spring has created object for us using bean factory. This is example of Inversion of Control
		// Instead of below line we can use: College bean = classPathXmlApplicationContext.getBean(College.class,"fc");
		// We can change the class attribute in bean tag present in applicationContextForXMLConfig.xml to have different implementation
		College college = (College) classPathXmlApplicationContext.getBean("fc");
		
		// Calling methods on bean
		System.out.println(college.getStreamsOffered());

		
		// Closing the context
		classPathXmlApplicationContext.close();
	}
}
