package com.skilldistillery.lottery.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hopper {
  List<PingPongBall> hopper;
  
  public Hopper() {
    this.hopper = new ArrayList<>();
  }
  
  public Hopper(int capacity) {
    this.hopper = new ArrayList<>(capacity);
  }
  
  public void addBalls(List<PingPongBall> balls) {
    hopper.addAll(balls);
  }

  public void shuffle() {
    Collections.shuffle(hopper);
  }
  
  public PingPongBall drawBall() {
    if (hopper != null && hopper.size() > 0) {
      return hopper.remove(0);
    }
    else { return null; }
  }
}
