package com.university.pune;

import java.util.ArrayList;
import java.util.List;

public class FergussonCollege implements College {

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

}
