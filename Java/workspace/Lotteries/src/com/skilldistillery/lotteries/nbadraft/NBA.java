package com.skilldistillery.lotteries.nbadraft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NBA {
	private ArrayList<String> teams = new ArrayList<>();
	private ArrayList<Integer> numbers = new ArrayList<>();
	private LotteryManager lm ;

	public NBA() throws IOException {
		File f = new File("teamlist.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String s;
		while ((s = br.readLine()) != null) {
			String team = s.split("\t")[0];
			Integer number = Integer.parseInt(s.split("\t")[1]);
			teams.add(team);
			numbers.add(number);

		}
		lm = new LotteryManager(teams, numbers);
		br.close();
	}

	public String askForWinner() {
		return lm.getWinner();
	}

}
