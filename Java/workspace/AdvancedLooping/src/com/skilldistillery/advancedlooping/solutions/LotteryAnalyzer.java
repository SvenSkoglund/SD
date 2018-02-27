package com.skilldistillery.advancedlooping.solutions;

public class LotteryAnalyzer {

  public static void main(String[] args) {
    LotteryAnalyzer analyzer = new LotteryAnalyzer();
    analyzer.findNumber(19);
  }

  private void findNumber(int number) {
    // Use nested for loops to determine if number occurs in the winners array.
    // When it does appear, print the indexes at which it was found.
    for (int i = 0; i < winners.length; i++) {
      int[] winner = winners[i];
      for (int j = 0; j < winner.length; j++) {
        if ( winner[j] == number ) {
          System.out.println("Found " + number + " at "+i+","+j);
        }
      }
    }
    
  }

  int[][] winners = {
      { 1, 33, 28, 29, 21 },  
      { 41, 23, 5, 39, 7 },                          
      { 37, 34, 33, 25, 35 },                    
      { 40, 12, 15, 5, 27 },                  
      { 30, 25, 12, 8, 21 },                
      { 13, 36, 48, 7, 11 },               
      { 23, 48, 36, 15, 31 },             
      { 7, 23, 15, 28, 36 },             
      { 31, 32, 23, 1, 26 },             
      { 28, 9, 49, 38, 29 },             
      { 16, 9, 6, 28, 38 },              
      { 17, 9, 7, 44, 20 },              
      { 18, 4, 30, 37, 3 },              
      { 4, 9, 27, 7, 32 },               
      { 27, 14, 6, 4, 5 },               
      { 14, 48, 15, 36, 9 },             
      { 28, 16, 35, 34, 3 },             
      { 23, 11, 12, 17, 10 },            
      { 3, 5, 45, 18, 13 },              
      { 44, 41, 46, 35, 5 },             
      { 18, 21, 28, 41, 4 },             
      { 15, 26, 28, 8, 43 },             
      { 18, 9, 14, 47, 42 },             
      { 11, 27, 13, 2, 31 },             
      { 15, 46, 34, 23, 40 },            
      { 22, 31, 3, 7, 14 },              
      { 19, 10, 48, 3, 21 },             
      { 32, 7, 45, 21, 26 },             
      { 41, 14, 13, 29, 16 },            
      { 40, 17, 21, 7, 49 },             
      { 2, 19, 35, 24, 28 },             
      { 37, 28, 33, 22, 25 }
  };
}
