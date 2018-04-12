package com.skilldistillery.lottery.common;

public class PingPongBall {
  private String label;

  public PingPongBall() {
  }

  public PingPongBall(String label) {
    super();
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return label;
  }

}
