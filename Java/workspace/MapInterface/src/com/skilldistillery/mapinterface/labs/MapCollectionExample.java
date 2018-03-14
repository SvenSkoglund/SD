package com.skilldistillery.mapinterface.labs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapCollectionExample {

	public static void main(String[] args) {
		Map <Character,String> letterToName= new HashMap<>();
		String name = "Amanda";
		Character firstChar = name.charAt(0);
		letterToName.put(firstChar, name);
		
		System.out.println(letterToName);
		
		Map <Character,Set<String>> letterToManyNames = new HashMap<>();
		String name2 = "Alan";
		Character firstChar2 = name.charAt(0);
		Set <String> names = new HashSet<>();
		letterToManyNames.put(firstChar, names);
		letterToManyNames.put(firstChar2, names);

		System.out.println(letterToManyNames);
		
	}

}
