package com.skilldistillery.exceptionsjunit.reference;

public class StringReplacer {

	public String replaceString(String input, String toReplace, String replaceStr) throws BadInputException {
		if(replaceStr == null || toReplace == null || input == null){
			throw new BadInputException();
		}
		
		return input.replace(toReplace, replaceStr);
	}

	public String replaceChar(String input, char match, char replace) throws BadInputException {
	  if(input == null){
      throw new BadInputException();
    }
	  return input.replace(match, replace);
	}

}
