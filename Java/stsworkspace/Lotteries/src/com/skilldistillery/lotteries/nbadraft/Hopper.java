package com.skilldistillery.lotteries.nbadraft;
import java.util.ArrayList;
import java.util.Collections;

public class Hopper {

	private ArrayList<PingPongBall> balls = new ArrayList<>();

	private ArrayList<PingPongBall> shuffleBalls(ArrayList<PingPongBall> balls) {
		Collections.shuffle(balls);
		return balls;
	}

	public String drawBall(ArrayList<PingPongBall> balls) {
		String winner = "";
		balls = shuffleBalls(balls);
		winner = balls.get(0).getLabel();
		return winner;
	}

	public ArrayList<PingPongBall> getBalls() {
		return balls;
	}

	public void setBalls(ArrayList<PingPongBall> balls) {
		this.balls = balls;
	}
	

		
		
	}


