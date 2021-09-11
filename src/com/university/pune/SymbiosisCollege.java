package com.university.pune;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Using @Component to tell spring to create bean for Annotation Configuration
@Component
public class SymbiosisCollege implements College {

	private ScholarShip scholarShip;

	public SymbiosisCollege() {
		super();
	}

	@Override
	public List<String> getStreamsOffered() {
		return new ArrayList<String>() {
			{
				add("Management");
				add("Arts");
			}
		};
	}
	
	// Setter Method necessary for Setter Dependency Injection
	// Using @Autowired Configuration for Annotation Dependency Injection with Setter Injection
	// Using @Qualifier as there are 2 beans which implement ScholarShip interface
	@Autowired
	public void setScholarShip(@Qualifier("academicScholarShip") ScholarShip scholarShip) {
		this.scholarShip = scholarShip;
	}

	@Override
	public String getScholarShipInfo() {
		return this.scholarShip.getscholarShipInfo();
	}
}
