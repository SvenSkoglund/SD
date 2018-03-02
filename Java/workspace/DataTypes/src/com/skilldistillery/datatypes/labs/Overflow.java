package com.skilldistillery.datatypes.labs;

public class Overflow {

	public static void main(String[] args) {

		int big = 2_147_483_647;
		int bigger = big + 1;

		System.out.println(big);
		System.out.println(bigger);

		// when the int variable reaches it's maximum value, adding another bit causes
		// the first bit in the byte to be turned on, making the number negative
	}

}
