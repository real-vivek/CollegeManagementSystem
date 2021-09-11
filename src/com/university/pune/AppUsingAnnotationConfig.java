package com.university.pune;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUsingAnnotationConfig {

	public static void main(String[] args) {
		// Loading the spring configuration file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContextForAnnotationConfig.xml");

		// Retrieving bean from spring container
		College collegeBean = (College) classPathXmlApplicationContext.getBean("fergussonCollege");
		College secondCollegeBean = (College) classPathXmlApplicationContext.getBean("symbiosisCollege");

		// Calling methods on bean
		System.out.println(collegeBean.getStreamsOffered());
		
		// Example of Annotation Dependency Injection with Constructor Dependency Injection
		System.out.println(collegeBean.getScholarShipInfo());
		
		// Example of Annotation Dependency Injection with Setter Dependency Injection
		System.out.println(secondCollegeBean.getScholarShipInfo());

		// Closing the context
		classPathXmlApplicationContext.close();
		
		
	}
}
