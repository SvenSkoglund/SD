package com.skilldistillery.lotteries.nbadraft;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class WinsComparator implements Comparator<String> {
	HashMap<String, Integer> toBeCompared;

	public WinsComparator(HashMap<String, Integer> t) {
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
