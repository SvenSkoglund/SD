package com.skilldistillery.texttranslation;

import java.util.Scanner;

public class PigLatinApp {

	public static void main(String[] args) {
		run();

	}

	private static void run() {
		PigLatinTranslator plt = new PigLatinTranslator();
		Translator eft = new ElmerFuddTranslator();
		Scanner kb = new Scanner(System.in);
		System.out.println("Press 1 to translate to Pig Latin. Press 2 for Elmer Fudd");
		int input = kb.nextInt();
		kb.reset();
		if (input == 1) {
			System.out.println("Enter the text to be translated to Pig Latin");
			String text = kb.nextLine();
			text = kb.nextLine();
			String translated = plt.translateText(text);
			System.out.println(translated);

		}
		else if (input == 2) {
			System.out.println("Enter the text to be translated to Elmer Fudd");
			String text = kb.nextLine();
			text = kb.nextLine();
			String translated = eft.translateText(text);
			System.out.println(translated);
		}
	}

}
