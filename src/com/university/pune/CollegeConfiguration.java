package com.university.pune;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("message.properties")
public class CollegeConfiguration {

	@Value("${dean.name}")
	private String deanName;

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

	@Bean
	public Dean dean() {
		Dean dean = new Dean();
		dean.setDeanName(deanName);
		return dean;
	}

	// bean to read ${} values
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
