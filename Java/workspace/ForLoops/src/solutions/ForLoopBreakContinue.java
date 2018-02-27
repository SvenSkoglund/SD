package solutions;

public class ForLoopBreakContinue {

  public static void main(String[] args) {
    // Try the loops in the examples above in code.
    // COPY-PASTE LOOP 1 HERE
    System.out.println("Loop 1...");
    // Exit the loop the first time i % 2 == 0
    for (int i = 1; i <= 10; i += 1) {
      if (i % 2 == 0) {
        break;
      }
      System.out.println(i);
    }

    System.out.println("Loop 2...");
    // COPY-PASTE LOOP 2 HERE
    for (int i = 0; i <= 10; i += 1) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }

    System.out.println("Loop 3...");
    // Write a loop that prints the numbers from 1 to 30, skipping
    // multiples of 3 by using the continue statement.
    for (int i = 0; i <= 30; i++) {
      if (i % 3 == 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
