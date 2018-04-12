package com.skilldistillery.lotteries.nbadraft;

import java.io.IOException;

public class NBAApp {

	public static void main(String[] args) throws IOException {

		run();
	}

	private static void run() throws IOException {

		NBA nba = new NBA();
		String winner = nba.askForWinner();
		System.out.println(winner);
		
	}

}
