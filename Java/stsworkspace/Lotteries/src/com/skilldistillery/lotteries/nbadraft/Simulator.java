package com.skilldistillery.lotteries.nbadraft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;


public class Simulator {

	public static void main(String[] args) throws IOException {

		HashMap <String,Integer> winRecords = new HashMap<>();
		
		
		// Test draft 100 times
		for (int i = 0; i < 1000; i++) {
			NBA nba = new NBA();
			String winner = nba.askForWinner();
			//System.out.println(winner);
			
			if (!winRecords.containsKey(winner)) {
				winRecords.put(winner, 1);
			}else {
				winRecords.put(winner, (winRecords.get(winner)+1));
			}
		}
		
		
		//Sort winners in ascending order
		Comparator comp = new WinsComparator(winRecords);
		List<String> keyList = new ArrayList(winRecords.keySet());
		keyList.sort(comp);
		Object[] keyArray = keyList.toArray();
		TreeMap <String, Integer> sortedHitList = new TreeMap();
		for (int i = 0; i < keyList.size(); i++) {
			System.out.println(keyArray[i] + " - > " + winRecords.get((keyArray)[i]));
			sortedHitList.put((String) keyArray[i], winRecords.get((keyArray)[i]));
		}
	}
}
