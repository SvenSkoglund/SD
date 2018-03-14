package com.skilldistillery.mapinterface.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapCollectionExample {

	public static void main(String[] args) throws IOException {
		// Create tree set to hold sorted names
		Set<String> names = new TreeSet<>();

		// Create map to store character keys that point names starting at that char
		Map<Character, Set> map = new HashMap<>();

		// adding file names.txt and storing to f
		File f = new File("names.txt");

		// create file/buffer reader to interact with names.txt
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		// create loop
		String line;
		// check if buffered reader line is not null, execute the loop
		while ((line = br.readLine()) != null) {
			// adding line from buffer reader in to generic names tree set
			names.add(line);
			// check to see if map at next char has value or not
			if (map.get(line.charAt(0)) == null) {
				// if no tree set for first letter of name exists, create new tree set and
				// assign first char as its key
				map.put(line.charAt(0), new TreeSet<>());
			} // adding name to the tree set corresponding to first letter
			map.get(line.charAt(0)).add(line);

		}
		System.out.println(map);
	}
}