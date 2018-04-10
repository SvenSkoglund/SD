package com.skilldistillery.lottery.powerball;

import java.util.List;

public class PowerBallDrawingResult {
  private List<Integer> winners;
  private Integer powerBall;
  public List<Integer> getWinners() {
    return winners;
  }
  public void setWinners(List<Integer> winners) {
    this.winners = winners;
  }
  public Integer getPowerBall() {
    return powerBall;
  }
  public void setPowerBall(Integer powerBall) {
    this.powerBall = powerBall;
  }
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("PowerBallDrawingResult [winners=").append(winners).append(", powerBall=").append(powerBall)
        .append("]");
    return builder.toString();
  }
  public PowerBallDrawingResult(List<Integer> winners, Integer powerBall) {
    super();
    this.winners = winners;
    this.powerBall = powerBall;
  }

}
