import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char[] playerTokens = assignTokens();
		char playerOneChar = playerTokens[0];
		char playerTwoChar = playerTokens[1];

		System.out.println("Player one = " + playerOneChar);
		System.out.println("Player two = " + playerTwoChar);

		char[][] board = newBoard();
		printBoard(board);
		int turn = 0;
		int row = 0;
		int column = 0;
		while (true) {
			if (turn % 2 == 0) {
				System.out.println("Player One's turn.");
				System.out.println("Enter the row ( 1 - 3 Top to Bottom)");
				row = scanner.nextInt() - 1;
				System.out.println("Enter the column ( 1-3 Left to Right )");
				column = scanner.nextInt() - 1;
				assignBoard(board, row, column, playerOneChar);
				printBoard(board);
				if (checkForWin(board)) {
					System.out.println("Player one wins!");
					System.exit(0);
				}
			}
			else if (turn % 2 == 1) {
				System.out.println("Player Two's turn.");
				System.out.println("Enter the row ( 1 - 3 Top to Bottom)");
				row = scanner.nextInt() - 1;
				System.out.println("Enter the column ( 1-3 Left to Right )");
				column = scanner.nextInt() - 1;
				assignBoard(board, row, column, playerTwoChar);
				printBoard(board);
				if (checkForWin(board)) {
					System.out.println("Player two wins!");
					System.exit(0);
				}
			}
			if (turn == 8 ) {
				System.out.println("No spaces left. Game over");
			}
			turn += 1;
		}

	}

	public static char[][] assignBoard(char[][] board, int row, int column, char mark) {
		board[row][column] = mark;
		return board;

	}

	public static char[][] printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		return board;

	}

	public static char[][] newBoard() {
		char newBoard[][] = { { '*', '*', '*' }, { '*', '*', '*' }, { '*', '*', '*' },

		};
		return newBoard;
	}

	public static char[] assignTokens() {
		char[] playerTokens = new char[2];
		while (true) {
			System.out.println("Player 1, please choose X or O");
			char playerOneChar = scanner.next().toUpperCase().charAt(0);
			if (playerOneChar == 'X') {
				playerTokens[0] = 'X';
				playerTokens[1] = 'O';
				return playerTokens;
			}
			else if (playerOneChar == 'O') {
				playerTokens[0] = 'O';
				playerTokens[1] = 'X';
				return playerTokens;
			}
			else {
				System.out.println("Unrecognized entry. Please try again");
			}
		}
	}

	public static boolean checkForWin(char[][] board) {
		boolean winner = false;
		if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
			winner = true;
		}
		else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
			winner = true;
		}
		else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
			winner = true;
		}
		else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
			winner = true;
		}
		else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			winner = true;
		}
		else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
			winner = true;
		}
		else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			winner = true;
		}
		else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
			winner = true;
		}
		else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
			winner = true;
		}
		else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
			winner = true;
		}
		else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
			winner = true;
		}
		else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
			winner = true;
		}
		else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
			winner = true;
		}
		else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
			winner = true;
		}
		else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			winner = true;
		}
		else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			winner = true;
		}
		else {
			winner = false;
		}
		return winner;
	}
}
