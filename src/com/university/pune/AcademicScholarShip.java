package com.university.pune;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class AcademicScholarShip implements ScholarShip, InitializingBean, DisposableBean {

	@Override
	public String getscholarShipInfo() {
		return "If you have scored above 92% in 12th std then you will receive 40% discount on your college fees";
	}

	// Example of life cycle init method using Java Configuration
	@Override
	public void destroy() throws Exception {
		System.out.println("From destroy method in AcademicSholarShip");
	}

	// Example of life cycle destroy method using Java Configuration
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From afterPropertiesSet method in AcademicSholarShip");
	}

}
