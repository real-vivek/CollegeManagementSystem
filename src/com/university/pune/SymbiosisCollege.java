package com.university.pune;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//Using @Component to tell spring to create bean for Annotation Configuration
@Component
public class SymbiosisCollege implements College {

	@Override
	public List<String> getStreamsOffered() {
		return new ArrayList<String>() {
			{
				add("Management");
				add("Arts");
			}
		};
	}
}
