package com.skilldistillery.sorting.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class ShowHits {

	public static void main(String[] args) throws IOException {
		// The access_log file contains records of hits to a web site. Consider each
		// line equivalent to one hit, and the first space-separated word on each line
		// identifies the visitor. Write a Java application that reads this file a line
		// at a time, and counts the number of hits from each unique visitor, storing
		// the results in a Map. When all the records have been read, display the unique
		// visitors along with the corresponding number of total hits. (Hint: Use
		// String's split() method to get the first field of each line.)
		File f = new File("access_log");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		TreeMap<String, Integer> hitList = new TreeMap<>();
		String s;

		while ((s = br.readLine()) != null) {
			String[] sArr = s.split(" ");
			if (!hitList.containsKey(sArr[0])) {
				hitList.put(sArr[0], 0);
			}
			hitList.replace(sArr[0], (hitList.get(sArr[0]) + 1));
		}
		Comparator comp = new HitsComparator(hitList);
		List<String> keyList = new ArrayList(hitList.keySet());
		keyList.sort(comp);
//		keyList.sort(hitList.get(key));
		Object[] keyArray = keyList.toArray();
		TreeMap <String, Integer> sortedHitList = new TreeMap();
		for (int i = 0; i < keyList.size(); i++) {
			System.out.println(keyArray[i] + " - > " + hitList.get((keyArray)[i]));
			sortedHitList.put((String) keyArray[i], hitList.get((keyArray)[i]));
		}

	}

}
