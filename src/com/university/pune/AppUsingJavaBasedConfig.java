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
		College collegeBean = (College) annotationConfigApplicationContext.getBean("fergussonCollege");
		
		// Example of singleton scope using java configuration
		System.out.println("Both instances of College created using getBean(\"fergussonCollege\") point to the same instance beacuse college==collegeBean is: " + (college==collegeBean));
		
		College secondCollege = (College) annotationConfigApplicationContext.getBean("symbiosisCollege");
		College secondCollegeBean = (College) annotationConfigApplicationContext.getBean("symbiosisCollege");
		
		// Example of singleton scope using java configuration
		System.out.println("Both instances of College created using getBean(\"symbiosisCollege\") point to the different instance beacuse secondCollege==secondCollegeBean is: " + (secondCollege==secondCollegeBean));
		
		// Calling methods on bean
		System.out.println(college.getStreamsOffered());
		
		// Example of Constructor Dependency Injection using Java Configuration
		System.out.println(college.getScholarShipInfo());
		
		// Example of Setter Dependency Injection using Java Configuration
		System.out.println(secondCollege.getScholarShipInfo());
		
		Dean dean = (Dean) annotationConfigApplicationContext.getBean("dean");
		// Example of BeanFactoryPostProcessor using
		System.out.println(dean.getDeanName());
		
		// Closing the context
		annotationConfigApplicationContext.close();
	}
}
