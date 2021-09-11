package com.university.pune;

import org.springframework.stereotype.Component;

@Component
public class AcademicScholarShip implements ScholarShip{

	@Override
	public String getscholarShipInfo() {
		return "If you have scored above 92% in 12th std then you will receive 40% discount on your college fees";
	}

}
