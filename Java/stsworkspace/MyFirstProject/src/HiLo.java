import java.util.Scanner;

public class HiLo {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Game();
        System.out.println("Goodbye!");
    }
    public static void Game() {
        boolean playing = true;
        while (playing == true) {
            int random = (int) (1+Math.random()*20);
            System.out.println("Please enter an guess of a number from 1-20: ");
            int input = keyboard.nextInt();
            while (input != random) {
                if (input < random) {
                    System.out.println("Guess higher!");
                    input = keyboard.nextInt();
                }
                else if(input > random) {
                    System.out.println("Guess lower!");
                    input = keyboard.nextInt();
                }
            }
            System.out.println("You guessed correctly! The number was "  + random);
            System.out.print("Would you like to play again? ");
            String playAgain = keyboard.next();
            while (true) {
                if (playAgain.equals("yes")) {
                    break;
                }
                else if (playAgain.equals("no")) {
                    playing = false;
                    break;
                }
                else {
                    System.out.print("Entry not recognized; please type yes or no.");
                    playAgain = keyboard.next();
                }
            }
        }
    }
}