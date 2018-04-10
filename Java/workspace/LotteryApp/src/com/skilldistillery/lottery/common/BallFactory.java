package com.skilldistillery.lottery.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BallFactory {
  
  public List<PingPongBall> orderBalls(String label, int count){
    List<PingPongBall> balls = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      balls.add(new PingPongBall(label));
    }
    return balls;
  }

  public List<PingPongBall> orderBalls(Map<String,Integer> order){
    List<PingPongBall> balls = new ArrayList<>();
    Set<String> keys = order.keySet();
    for (String key : keys) {
      int count = order.get(key);
      for (int i = 0; i < count; i++) {
        balls.add(new PingPongBall(key));
      }
    }
    return balls;
  }

}
