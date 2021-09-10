package com.university.pune;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfiguration {

	// Creating bean for Fergusson College
	// @Bean tells spring to create a bean for the methods return type
	@Bean
	public FergussonCollege fergussonCollege() {
		return new FergussonCollege();
	}

	// Creating bean for Symbiosis College
	@Bean
	public SymbiosisCollege symbiosisCollege() {
		return new SymbiosisCollege();
	}
	
	@Bean
	public SportScholarShip sportScholarShip() {
		return new SportScholarShip();
	}
	
	@Bean
	public AcademicScholarShip academicScholarShip() {
		return new AcademicScholarShip();
	}
}
