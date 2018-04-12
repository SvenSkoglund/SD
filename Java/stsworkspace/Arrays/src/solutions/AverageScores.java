package solutions;

import java.util.Scanner;

public class AverageScores {

  public static void main(String[] args) {
    int[] scores = new int[5];
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter scores:");
    for(int i = 0; i < scores.length; i++) {
      int scoreNum = i + 1;
      System.out.print("Score " + scoreNum + ": ");
      scores[i] = scanner.nextInt();
    }
    
    // Call the test method
    //testCalculateAverage();
    
    double average = calculateAverage(scores);
    
    System.out.println("The average score is: " + average);
    scanner.close();
  }
  
  public static double calculateAverage(int[] scores) {
    double average = 0.0;
    
    // variable to hold the sum of all scores
    double sum = 0.0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    
    average = sum / scores.length; // divide by the length because
                                   // we don't know how long the passed-in
                                   // array is (even though we're the ones passing it)
    return average;
  }
  
  public static void testCalculateAverage() {
    int[] ints = {70, 65, 80, 97};
    
    double expected = 78.0;
    
    // Calculate the average to see what the method produces
    double result = calculateAverage(ints);
    
    // Now test the result
    if(expected == result) {
      System.out.println("Passed");
    }
    else {
      System.out.println("Failed, expected " + expected + " but got " + result);
    }
  }

}
