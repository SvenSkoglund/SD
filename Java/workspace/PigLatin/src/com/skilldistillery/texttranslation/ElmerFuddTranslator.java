package com.skilldistillery.texttranslation;

public class ElmerFuddTranslator extends AbstractTranslator {

	@Override
	public String translateWord(String word) {
		String fuddWord = "";
		if ( word == null) {
			return fuddWord;
		}
		fuddWord=word;
		fuddWord = fuddWord.replace('r', 'w');
		fuddWord = fuddWord.replaceAll("R", "W");
		fuddWord = fuddWord.replace('l', 'w');
		fuddWord = fuddWord.replaceAll("L", "W");
		return fuddWord;
		
	}
}
