package com.skilldistillery.mapinterface.drills;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingHashMap {

	public static void main(String[] args) {
		UsingHashMap uhm = new UsingHashMap();
		uhm.launch();
	}

	private void launch() {
		// Declare and instantiate a map to hold Integer--->String key-value pairs
		Map<Integer, String> map = new HashMap<>();
		// Put these pairs in the map
		// 1 George Washington
		map.put(1, "George Washington");
		// 16 Abraham Lincoln
		map.put(16, "Abraham Lincoln");
		// 32 Franklin D. Roosevelt
		map.put(32, "Franklin D. Roosevelt");
		// 36 Lyndon B. Johnson
		map.put(36, "Lyndon B. Johnson");
		// 44 Barack Obama
		map.put(44, "Barack Obama");
		// Get the value for key 16 and output the key and value to the screen
		System.out.println("Key value 16 = " + map.get(16));
		// Get the value for key 37 and output the key and value to the screen
		System.out.println("Key value 37 = " + map.get(37));
		// Get the value for key 36 and output the key and value to the screen.
		System.out.println("Key value for 36 = " + map.get(36));
		// Iterate through the Map and output the key-value pairs in the format
		Set<Integer> s = map.keySet();
		Iterator <Integer> it = s.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "\t\t" + map.get(key));
		}
		// key[tab][tab]value

	}

}
