package com.skilldistillery.namegen;

import java.util.Scanner;

public class NameGenerator {
	public static String firstNames[] = { "The", "Tha", "Amazing", "Wonderful", "Cordial", "Impeccable", "Stylin'",
			"Shoutin'", "Armchair", "Argumentative", "Desperate", "Analagous", "Graduate", "Childish", "Annual",
			"Dogmatic", "Violent", "Expert", "Smilin'", "Drunken", "Structural", "Vulgar", "Foolish", "Mad",
			"Inspector", "Captain", "Colonel", "Lazy", "Solid", "Dynamic", "Angry", "Visual", "Exemplary", "Insane",
			"Arrogant", "Polymorphic", "Multidimensional" };

	public static String lastNames[] = { "Developer", "Ambassador", "Programmer", "Protector", "Funk", "Philosopher",
			"Monster", "Outsider", "Master", "Chieftain", "Despot", "Artist", "Creator", "Warrior", "Pupil", "Watcher",
			"Conqueror", "Mastermind", "Structure", "Wanderer", "Overlord", "Samurai", "Menace", "Clinician", "Doctor",
			"Leader", "Destroyer", "Commander", "Menace", "Specialist", "Exception", "Crusader", "CEO", "President",
			"Baller", "Carcinogen", "2D Array"

	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name[] = new String[2];
		System.out.print("Enter your first name: ");
		name[0] = scanner.next().toUpperCase();

		System.out.println("Enter your last name: ");
		name[1] = scanner.next().toUpperCase();

		String translatedName = translateName(name);
		System.out.println(translatedName);
	}

	public static String translateName(String [] name) {
		int indexFirst = getArrayIndexFromName(name [0] );
		int indexLast = getArrayIndexFromName(name [1] );

		String result = (firstNames[indexFirst] + " " + lastNames[indexLast]);
		return result;

	}

	public static int getArrayIndexFromName(String name) {
		int index = 0;
		for (int i = 0; i < name.length(); i++) {
			index += name.charAt(i);
		}
		index %= firstNames.length;
		return index;
	}

}
