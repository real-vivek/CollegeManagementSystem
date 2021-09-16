package com.university.pune;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUsingAnnotationConfig {

	public static void main(String[] args) {
		// Loading the spring configuration file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContextForAnnotationConfig.xml");

		// Retrieving bean from spring container
		College collegeBean = (College) classPathXmlApplicationContext.getBean("fergussonCollege");
		College college = (College) classPathXmlApplicationContext.getBean("fergussonCollege");
		
		// Example of singleton scope using annotation configuration
		System.out.println("Both instances of College created using getBean(\"fergussonCollege\") point to the same instance beacuse college==collegeBean is: " + (college==collegeBean));
		
		College secondCollegeBean = (College) classPathXmlApplicationContext.getBean("symbiosisCollege");
		College secondCollege = (College) classPathXmlApplicationContext.getBean("symbiosisCollege");

		// Example of singleton scope using annotation configuration
		System.out.println("Both instances of College created using getBean(\"symbiosisCollege\") point to the different instance beacuse secondCollege==secondCollegeBean is: " + (secondCollege==secondCollegeBean));
				
		
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
