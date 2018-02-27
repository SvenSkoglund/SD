package com.skilldistillery.advancedarrays.solutions;

public class MultiDeclare2 {
  public static void main(String[] args) {
    // Declare a two-dimensional array of char values to represent a 
    // tic-tac-toe board.
    char[][] board = new char[3][3];
    
    // Assign the value 'X' to the top-left, middle, and bottom-right squares.
    // X  
    //  X 
    //   X
    board[0][0] = 'X';
    board[1][1] = 'X';
    board[2][2] = 'X';
    // Assign the value 'O' (capital 'o') to the three squares bottom-left.
    // X  
    // OX 
    // OOX
    board[1][0] = 'O';
    board[2][0] = 'O';
    board[2][1] = 'O';
    
    // Assign the value '*' to the remaining squares.
    // X**  
    // OX*
    // OOX
    board[0][1] = '*';
    board[0][2] = '*';
    board[1][2] = '*';
    
    printBoard(board);
  }
  
  public static void printBoard(char[][] board) {
    for(int row=0; row < board.length; row++) {
      for(int col=0; col < board[row].length; col++) {
        System.out.print(board[row][col]);
      }
      System.out.println();
    }
  }
}
