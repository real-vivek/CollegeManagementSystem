package com.university.pune;

public class AppUsingTraditionalJava {

	public static void main(String[] args) {

		// We can change FergussonCollege to any other object which implements College interface
		College fc = new SymbiosisCollege();
		System.out.println(fc.getStreamsOffered());

	}
}
