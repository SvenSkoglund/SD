package com.skilldistillery.lotteries.nbadraft;

import java.util.ArrayList;

public class PingPongBallFactory {

	public ArrayList<PingPongBall> makeBalls(String label, int quantity){
		ArrayList<PingPongBall> ballsToReturn = new ArrayList<>();
		for(int i = 0 ; i < quantity ; i++) {
			PingPongBall newBall = new PingPongBall(label);
			ballsToReturn.add(newBall);
		}
		return ballsToReturn;
	}
}
