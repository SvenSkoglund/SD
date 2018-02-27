package solutions;

public class WhileLoop {

  public static void main(String[] args) {

    printNumbers();

    mathRandomWhile();

  }

  public static void printNumbers() {
    // Write a while loop to print the numbers 1 to 10 to the screen.
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i = i + 1;
    }
  }

  public static void mathRandomWhile() {
    // Use Math.random() to write a while loop that will execute as long as a random
    // number is less than 0.7. Print the number inside the loop.
    // Make sure to reassign d to a new Math.random() value in the loop body.
    // Example: double d = Math.random();
    double d = Math.random();
    while (d < 0.7) {
      System.out.println(d);
      d = Math.random();
    }
    System.out.println("Final value of d: " + d);
  }

}
