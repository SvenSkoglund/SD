package com.skilldistillery.advancedarrays.drills;

public class MultiDeclare {
	public static void main(String[] args) {
		// Declare a two-dimensional array of char values to represent a
		// tic-tac-toe board.

		char[][] ticTacToeBoard = new char[3][3];
		createEmptyBoard(ticTacToeBoard);
		// Assign the value 'X' to the top-left, middle, and bottom-right squares.
		// X
		// X
		// X
		ticTacToeBoard[0][0] = 'X';
		ticTacToeBoard[1][1] = 'X';
		ticTacToeBoard[2][2] = 'X';
		printBoard(ticTacToeBoard);

		// Assign the value 'O' (capital 'o') to the three squares bottom-left.
		// X
		// OX
		// OOX
		ticTacToeBoard[1][0] = 'O';
		ticTacToeBoard[2][0] = 'O';
		ticTacToeBoard[2][1] = 'O';
		printBoard(ticTacToeBoard);

		// Assign the value '*' to the remaining squares.
		// X**
		// OX*
		// OOX
		ticTacToeBoard[0][1] = '*';
		ticTacToeBoard[0][2] = '*';
		ticTacToeBoard[1][2] = '*';
		printBoard(ticTacToeBoard);

	}

	private static void createEmptyBoard(char[][] ticTacToeBoard) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ticTacToeBoard[i][j] = '*';
			}
		}
	}

	public static void printBoard(char[][] ticTacToeBoard) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ticTacToeBoard[i][j]);
			}
			System.out.println();
		}

	}
}
