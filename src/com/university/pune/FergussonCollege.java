package com.university.pune;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FergussonCollege implements College {

	// Using @Autowired Configuration for Annotation Dependency Injection with Field Injection
	// Using @Qualifier as there are 2 beans which implement ScholarShip interface
	@Autowired
	@Qualifier("sportScholarShip")
	private ScholarShip scholarShip;
	
	public FergussonCollege() {
		super();
	}

	// Constructor necessary for constructor dependency injection
	// Using @Autowired Configuration for Annotation Dependency Injection with Constructor Injection
	// Using @Qualifier as there are 2 beans which implement ScholarShip interface
	@Autowired
	public FergussonCollege(@Qualifier("sportScholarShip") ScholarShip scholarShip) {
		this.scholarShip = scholarShip;
	}

	@Override
	public List<String> getStreamsOffered() {
		return new ArrayList<String>() {
			{
				add("Science");
				add("Arts");
				add("Animation");
				add("Vocational Training");
			}
		};
	}
	
	public ScholarShip getScholarShip() {
		return scholarShip;
	}

	public void setScholarShip(ScholarShip scholarShip) {
		this.scholarShip = scholarShip;
	}

	@Override
	public String getScholarShipInfo() {
		return this.scholarShip.getscholarShipInfo();
	}

}
