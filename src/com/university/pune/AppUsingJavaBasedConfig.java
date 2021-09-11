package com.university.pune;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppUsingJavaBasedConfig {

	public static void main(String[] args) {

		// Loading the spring configuration file
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				CollegeConfiguration.class);

		// Retrieving bean from spring container
		// symbiosisCollege is method name annotated with @Bean annotation in CollegeCOnfigut
		College college = (College) annotationConfigApplicationContext.getBean("fergussonCollege");
		College secondCollege = (College) annotationConfigApplicationContext.getBean("symbiosisCollege");
		

		// Calling methods on bean
		System.out.println(college.getStreamsOffered());
		
		// Example of Constructor Dependency Injection using Java Configuration
		System.out.println(college.getScholarShipInfo());
		
		// Example of Setter Dependency Injection using Java Configuration
		System.out.println(secondCollege.getScholarShipInfo());
		
		// Closing the context
		annotationConfigApplicationContext.close();
	}
}
