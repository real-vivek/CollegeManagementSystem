package com.university.pune;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CollegeConfiguration {

	// Creating bean for Fergusson College
	// @Bean tells spring to create a bean for the methods return type
	@Bean
	@Scope("singleton")
	public FergussonCollege fergussonCollege() {
		// Example of Constructor dependency injection using Java Configuration
		return new FergussonCollege(sportScholarShip());
	}

	// Creating bean for Symbiosis College
	@Bean
	@Scope("prototype")
	public SymbiosisCollege symbiosisCollege() {
		SymbiosisCollege symbiosisCollege = new SymbiosisCollege();
		// Example of Setter dependency injection using Java Configuration
		symbiosisCollege.setScholarShip(academicScholarShip());
		return symbiosisCollege;
	}
	
	@Bean
	public SportScholarShip sportScholarShip() {
		return new SportScholarShip();
	}
	
	@Bean
	public AcademicScholarShip academicScholarShip() {
		return new AcademicScholarShip();
	}
	
	@Bean
	public InitBean initBean() {
		return new InitBean();
	}
}
