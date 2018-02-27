import java.util.Scanner;

public class ForFun {

	public static void main(String[] args) {
		int card;
		int playerScore = 0;
		int dealerScore = 0;
		boolean newCard;
		
		System.out.println("Welcome to BlackJack, lets begin.");
		
		System.out.println("The dealer deals you two cards face up.");
		int cardOne = (int) (1 + 12 * Math.random());
		int cardTwo =  (int) (1 + 12 * Math.random());
		System.out.println("The first card is " + cardOne + " and the second card is " + cardTwo);
		playerScore = cardOne + cardTwo;
		System.out.println("Your score is " + playerScore);
		
		System.out.println("The dealer deals himself one care face down and one card face up.");
		int faceUp = (int) (1 + 14 * Math.random());
		System.out.println("The face up card is " + faceUp);
		dealerScore = faceUp;
		System.out.println("The dealer's is showing " + dealerScore);
		
		playerScore = playerTurn(playerScore);
		
	}
	public static int cardFlip() {
		int card = (int) (1+14*Math.random());
		System.out.println("Dealer flips a card and it is " + card);
		return card;
	}
	public static int playerTurn(int playerScore) {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("It is your turn, hit or stand?");
		String hitOrStand = scanner.nextLine();
		while (i == 0) {
		if (hitOrStand.equals("hit")){
			playerScore = playerScore + cardFlip();
			System.out.println("Your score is now " + playerScore);
			return playerScore;
		}
		if (hitOrStand.equals("hit")){
			return playerScore;
		}
		else {
			System.out.println("Invald input, try again! ");
		}
		}
		return 0;
	}
}
