package com.skilldistillery.romannumerals;

import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		RomanNumeralTranslator rnt = new RomanNumeralTranslator();
		
		
		System.out.println("Please enter a number to be translated to Roman numerals");
		String entry = scanner.nextLine();
		
		
		String translated = rnt.translateWord(entry);
		System.out.println("Translated: " + translated);
	}

}
