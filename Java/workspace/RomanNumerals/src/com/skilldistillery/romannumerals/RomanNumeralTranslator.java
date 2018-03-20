package com.skilldistillery.romannumerals;

public class RomanNumeralTranslator implements Translator {

	@Override
	public String translateWord(String engWord) {
		int num;
		try {
			num = Integer.parseInt(engWord);
		} catch (NumberFormatException e) {
			return engWord;
			
		}
		StringBuilder answer = new StringBuilder("");
		while (num / 50 >= 1) {

			answer.append("L");
			num = num - 50;
		}
		while (num / 40 >= 1) {

			answer.append("XL");
			num = num - 40;
		}
		while (num / 10 >= 1) {

			answer.append("X");
			num = num - 10;
		}
		if (num / 5 == 1) {
			answer.append("V");
			num = num % 5;
		}
		while (num / 1 >= 1) {

			answer.append("I");
			num = num - 1;
		}

		int lastIndex = engWord.length() - 1;
		if (engWord.charAt(lastIndex) == '4' || engWord.charAt(lastIndex) == '9')

		{
			if (engWord.charAt(lastIndex) == '4') {
				answer.replace(answer.length() - 4, answer.length(), "IV");
			}
			if (engWord.charAt(lastIndex) == '9') {
				answer.replace(answer.length() - 5, answer.length(), "IX");
			}
		}

		return answer.toString();
	}

	@Override
	public String translateText(String engText) {
		// TODO Auto-generated method stub
		return null;
	}

}
