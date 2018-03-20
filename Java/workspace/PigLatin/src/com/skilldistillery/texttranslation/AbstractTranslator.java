package com.skilldistillery.texttranslation;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTranslator implements Translator {

	public AbstractTranslator() {

	}

	@Override
	public String translateWord(String s) {
		System.out.println("Hi I am in an abstract translator");
		return null;
	}

	@Override
	public String translateText(String s) {
		if (s == null) {
			return "";
		}
		String[] stringArray = s.split(" ");
		List<String> stringList = new ArrayList<>();
		String returned = "";
		for (int i = 0; i < stringArray.length; i++) {
			stringList.add(stringArray[i]);
		}
		for (int j = 0; j < stringList.size(); j++) {
			returned += translateWord(stringList.get(j)) + " ";
		}
		return returned;
	}

}
