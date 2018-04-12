package com.skilldistillery.casting.labs;

public class NameChanger {
	//NameChanger has two methods.
	//
	// calculateNumericValue - this method takes a String argument and returns a
	// number value.
	//
	// The number value is derived by adding the value of each character in the
	// String. For example, Ann returns 285.
	// Use the String method toCharArray() to get a char[] of the String's
	// characters.
	// Find the sum of the chars by iterating through the char[] and adding each
	// chars value.
	// transformString - this method takes a String argument and "shifts" each
	// character in the String by 3 characters. For example, the String Ann becomes
	// Dpp. It returns a String.
	
	public int calculateNumericValue(String name) {
		char [] nameArray = new char[name.length()];
		int total = 0;
		for ( int i = 0 ; i < name.length() ; i ++) {
			nameArray[i] = name.charAt(i);
			total = total + nameArray[i];
		}
		System.out.println("Numeric value: "+ total);
		return total;
	}
	public String transformString(String name) {
		char [] nameArray = name.toCharArray();
		int holder = 0;
		for ( int i = 0 ; i < nameArray.length ; i ++) {
			nameArray[i] = (char) (nameArray[i] + 3);
		}
		String transformedName = new String(nameArray);
		System.out.println("Transformed: " + transformedName);
		return transformedName;
	}
}
