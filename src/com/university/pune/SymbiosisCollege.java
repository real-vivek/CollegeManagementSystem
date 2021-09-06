package com.university.pune;

import java.util.ArrayList;
import java.util.List;

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
