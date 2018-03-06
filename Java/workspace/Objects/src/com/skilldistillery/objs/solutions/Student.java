package com.skilldistillery.objs.solutions;

public class Student{
  
  /*
   * Of course we make scores private. This is the basis of encapsulation.
   */
  private int[] scores; 
  private double average;
  
  public double getAverage(){ return average; }
  
  private void computeAverage(){
      // valid code to compute average
      // average = update average value
  }

  public Student(){
      computeAverage();
  }
  
  /*
   * Change getScores to return a copy of the scores list.
   * 
   * If we return a reference to scores, users could change the elements.
   * By returning a copy of the array, we protect the original scores.
   * This is known as a "defensive" copy. 
   */
  public int[] getScores() {
    int[] sCopy = new int[scores.length];
    for (int i=0; i < scores.length; i++) {
      sCopy[i] = scores[i];
    }
    return sCopy;
  }
}

