package com.skilldistillery.lotteries.nbadraft;

import java.util.ArrayList;

public class LotteryManager {
	private PingPongBallFactory ppbf = new PingPongBallFactory();
	private Hopper hopper = new Hopper();
	private ArrayList<String> labels;
	private ArrayList<String> ballLabels = new ArrayList<>();
	private ArrayList<Integer> numberOfEachLabel = new ArrayList<>();
	

	public LotteryManager(ArrayList<String> labels, ArrayList<Integer> numberOfEachLabel) {
		
		addBalls(labels,numberOfEachLabel);
	}
	public void addBalls(ArrayList<String> labels, ArrayList<Integer> quantity) {
		for (int i = 0; i < labels.size(); i++) {
			String teamName = labels.get(i);
			int quantityPerTeam = quantity.get(i);
			ArrayList <PingPongBall> ballOrder = ppbf.makeBalls(teamName, quantityPerTeam);
			ArrayList <PingPongBall> hopperBalls = hopper.getBalls();
			hopperBalls.addAll(ballOrder);
			hopper.setBalls(hopperBalls);
		}
	}
	public String getWinner() {
		ArrayList <PingPongBall> ballPool = hopper.getBalls();
		String winner = hopper.drawBall(ballPool);
		return winner;
	}
}
