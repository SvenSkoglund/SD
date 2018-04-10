package com.skilldistillery.examples.lotto.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Hopper {
	private String name;
	private List<PingPongBall> pingPongBalls;
	private int counter = 0;

	public Hopper() {
		this.pingPongBalls = new ArrayList<>();
		for(int i=1; i<=45; i++) {
		  pingPongBalls.add(new PingPongBall(Integer.toString(i)));
		}
	}

	public PingPongBall drawBall() {
		return pingPongBalls.get(counter++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void reset() {
		Collections.shuffle(pingPongBalls);
		counter = 0;
	}

	public List<PingPongBall> getPingPongBalls() {
		return pingPongBalls;
	}

	public void setPingPongBalls(List<PingPongBall> pingPongBalls) {
		this.pingPongBalls = pingPongBalls;
	}

}