package solutions;

public class ForLoop {

  public static void main(String[] args) {
    // Write a for loop to print the numbers 1 to 10 to the screen.
    int i;
    for (i = 1; i <= 10; i = i + 1) {
      System.out.println(i);
    }

    // Options: declaring the loop control variable in the loop
    // using different operators to increment the loop control variable
    for (int j = 1; j <= 10; j++) {
      System.out.println(j);
    }

    // Write the same loop with the loop control variable starting at 0.
    for (int k = 0; k < 10; k++) {
      System.out.println(k + 1); // note how this does not change k because
      // k is not reassigned a value
    }

  }

}
