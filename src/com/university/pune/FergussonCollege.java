package com.university.pune;

import java.util.ArrayList;
import java.util.List;

public class FergussonCollege implements College {

	private ScholarShip scholarShip;

	public FergussonCollege() {
		super();
	}

	public FergussonCollege(ScholarShip scholarShip) {
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

	@Override
	public String getScholarShipInfo() {
		return this.scholarShip.getscholarShipInfo();
	}

}
