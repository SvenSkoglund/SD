package com.skilldistillery.datatypes.labs;

public class ValidInt {

	public static void main(String[] args) {
		// Declare an int variable validInt and assigns it a valid value.
		// Declare a long variable longInt and assigns validInt to it.
		// Now try to assign longInt back to validInt. Did it work?
		
		int validInt = 1;
		long longInt = validInt;
		validInt = longInt;
		
		// It did not, longInt is too big to fit inside of an int
	}

}
