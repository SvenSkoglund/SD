package com.skilldistillery.texttranslation;

import java.util.regex.Pattern;

public class PigLatinTranslator extends AbstractTranslator {

	public PigLatinTranslator() {

	}

	@Override
	public String translateWord(String s) {
		String returnString;
		String ay = "ay";
		String newS;
		if (s == null) {
			return "";
		}
		if (s.matches("^[^aeiouAEIOU][aeiouAEIOU].*")) {
			s = s + s.charAt(0) + ay;
			returnString = s.replaceFirst((String.valueOf(s.charAt(0))), "");
		} else if (s.matches("^[^aeiouAEIOU][^aeiouAEIOU].*")) {
			s = s + s.charAt(0) + s.charAt(1) + ay;
			newS = s.replaceFirst((String.valueOf(s.charAt(0))), "");
			returnString = newS.replaceFirst((String.valueOf(newS.charAt(0))), "");
		} else if (s.matches("^[aeiouAEIOU].*")) {
			s += "way";
			returnString = s;
		} else {
			returnString = "";
		}
	
		return returnString;
	}
}
