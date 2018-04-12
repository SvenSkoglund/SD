package com.skilldistillery.sorting.labs;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class HitsComparator implements Comparator<String> {
	TreeMap<String, Integer> toBeCompared;

	public HitsComparator(TreeMap<String, Integer> t) {
		toBeCompared = t;
	}

	@Override
	public int compare(String a, String b) {
		if (toBeCompared.get(a) > toBeCompared.get(b)) {
			return 1;
		}
		else if (toBeCompared.get(a) < toBeCompared.get(b)) {
			return -1;
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
