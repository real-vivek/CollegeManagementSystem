package com.university.pune;

import org.springframework.stereotype.Component;

@Component
public class SportScholarShip implements ScholarShip {

	@Override
	public String getscholarShipInfo() {
		return "If you have played any sports at national level then you will receive 30% discount on your college fees";
	}

}
