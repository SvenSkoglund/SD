package solutions;

import java.util.Scanner;

public class AverageScoresLargest {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("How many scores will you enter? ");
    int numScores = scanner.nextInt();
    
    // Create an array with the desired number of scores
    int[] scores = new int[numScores];
    
    // Create a variable to hold the largest. It will start with the first
    // element in the array.
    int largest = scores[0];
    int largestIndex = 0;
    
    System.out.println("Enter scores:");
    for(int i = 0; i < scores.length; i++) {
      int scoreNum = i + 1;
      System.out.print("Score " + scoreNum + ": ");
      scores[i] = scanner.nextInt();
      // if this number is greater than the previous largest, assign
      // its value to largest
      if(scores[i] > largest) {
        largest = scores[i];
        largestIndex = i;
      }
    }
    
    // Call the test method
    //testCalculateAverage();
    
    double average = calculateAverage(scores);
    
    // Output the calculated values.
    System.out.println("The average score is: " + average);
    System.out.println("The largest score is at index [" + largestIndex + "]: " + largest);
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
