package com.skilldistillery.advancedarrays.solutions;

public class MultiAccess {
  public static void main(String[] args) {
    char[][] board = new char[3][3];
    board[0][0] = 'X';
    board[1][1] = 'X';
    board[2][2] = 'X';
    
    board[1][0] = 'O';
    board[2][0] = 'O';
    board[2][1] = 'O';
    
    board[0][1] = '*';
    board[0][2] = '*';
    board[1][2] = '*';
    
    // Call the method in main() to print your board.
    printBoard(board);
    
  }
  // Add a method called printBoard to iterate through the tic-tac-toe board. 
  // Its one parameter is a 2-d array of chars, same as your tic-tac-toe board.

  public static void printBoard(char[][] charArr) {
    for(int row=0; row < charArr.length; row++) {
      for(int col=0; col < charArr[row].length; col++) {
        System.out.print(charArr[row][col]);
      }
      System.out.println();
    }
  }
}
