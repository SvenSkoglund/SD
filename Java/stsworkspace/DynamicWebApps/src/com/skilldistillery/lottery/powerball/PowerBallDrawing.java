package com.skilldistillery.lottery.powerball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.skilldistillery.lottery.common.BallFactory;
import com.skilldistillery.lottery.common.Hopper;

public class PowerBallDrawing {

  private static final int DEFAULT_WHITE_BALL_COUNT = 69;
  private static final int DEFAULT_RED_BALL_COUNT = 26;
  private int whiteBallCount;
  private int redBallCount;
  private Hopper whiteHopper = new Hopper();
  private Hopper redHopper = new Hopper();

  public PowerBallDrawing(int whiteBallCount, int redBallCount) {
    this.whiteBallCount = whiteBallCount;
    this.redBallCount = redBallCount;
    loadHoppers();
  }

  public PowerBallDrawing() {
    this(DEFAULT_WHITE_BALL_COUNT, DEFAULT_RED_BALL_COUNT);
  }

   public PowerBallDrawingResult getResults() {
     List<Integer> winners = new ArrayList<>();
     for (int i=0; i<5; i++) {
       winners.add(Integer.parseInt(whiteHopper.drawBall().getLabel()));
     }
     Collections.sort(winners);
     Integer powerBall = new Integer(redHopper.drawBall().getLabel());
     
    return new PowerBallDrawingResult(winners, powerBall);
   }
   
   private void loadHoppers() {
     BallFactory factory = new BallFactory();
     for (int i=1; i<=whiteBallCount; i++) {
       whiteHopper.addBalls(factory.orderBalls(""+i, 1));
     }
     whiteHopper.shuffle();
     for (int i=1; i<=redBallCount; i++) {
       redHopper.addBalls(factory.orderBalls(""+i, 1));
     }     
     redHopper.shuffle();
   }

}
