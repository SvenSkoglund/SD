package com.sd;

public class CastingTest {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		CastingTest ct = new CastingTest();
		
		String s = "q";
		Comparable c = s; //Works because String implements Comparable
		
		System.out.println(s.toLowerCase());
		System.out.println(c.toLowerCase());
		// Try using the Comparable reference to call c.toLowerCase().
		
		
		// Will the line below compile?
		// Comparable maybe = ct;
		
		// Will the line below compile?
		// Will it execute without any issues?
		// Comparable comp = (Comparable) ct;
	}
}
