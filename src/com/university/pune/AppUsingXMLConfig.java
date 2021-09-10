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
		
		College secondCollege = (College) classPathXmlApplicationContext.getBean("sc");
		
		
		// Calling methods on bean
		System.out.println(college.getStreamsOffered());

		
		// Example showing dependency injection using XML configuration(Constructor Injection)
		// We can change the implementation of Scholarship interface by changing the ref attribute in constructor-arg tag in applicationContextForXMLConfig.xml
		System.out.println(college.getScholarShipInfo());
		
		// Example showing Dependency Injection using XML Configuration(Setter Injection)
		// We can change the implementation of Scholarship interface by changing the ref attribute in property tag in applicationContextForXMLConfig.xml
		System.out.println(secondCollege.getScholarShipInfo());
		
		// Closing the context
		classPathXmlApplicationContext.close();
	}
}
