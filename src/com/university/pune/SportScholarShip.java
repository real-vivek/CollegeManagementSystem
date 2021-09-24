package com.university.pune;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SportScholarShip implements ScholarShip {

	@Override
	public String getscholarShipInfo() {
		return "If you have played any sports at national level then you will receive 30% discount on your college fees";
	}

	// Example of life cycle init method using Annotation Configuration
	@PostConstruct
	public void initiMethod() {
		System.out.println("From post-construct method in SpostScholarShip");
	}

	// Example of life cycle destroy method using Annotation Configuration
	@PreDestroy
	public void destroyMethod() {
		System.out.println("From pre-destroy method in SpostScholarShip");
	}
}
