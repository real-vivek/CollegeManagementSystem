package com.university.pune;

import java.util.ArrayList;
import java.util.List;

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
	public void setScholarShip(ScholarShip scholarShip) {
		this.scholarShip = scholarShip;
	}

	@Override
	public String getScholarShipInfo() {
		return this.scholarShip.getscholarShipInfo();
	}
}
