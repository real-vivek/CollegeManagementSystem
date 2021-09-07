package com.university.pune;

public class AppUsingTraditionalJava {

	public static void main(String[] args) {

		// We can change FergussonCollege to any other object which implements College interface
		College fc = new FergussonCollege();
		System.out.println(fc.getStreamsOffered());

	}
}