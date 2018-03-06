import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Player 1, please choose X or O");
		char playerOneChar = scanner.next();

	}

	public static char[][] printBoard(char[][] board, int row, int column, char mark) {
		board[row][column] = mark;
		return board;

	}

	public static char[][] newBoard() {
		char newBoard[][] = { { '*', '*' }, { '*', '*' }, { '*', '*' },

		};
		return newBoard;
	}
}
