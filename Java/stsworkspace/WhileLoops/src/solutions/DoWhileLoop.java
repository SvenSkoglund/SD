package solutions;

public class DoWhileLoop {

  public static void main(String[] args) {
    // Write a do-while loop to print the numbers 1 to 10 to the screen.
    int x = 1;
    do {
      System.out.println(x);
      x = x + 1;
    } while (x <= 10);

    // Use Math.random() to write a do-while loop that will execute as long as a
    // random number is less than 0.7. Print the number inside the loop.
    // Declare a variable outside the loop, and assign a new Math.random() value in
    // the loop body. Then print the number to the screen.
    // Example: double d = Math.random();
    // Add a statement after the loop to print the final value of d.
    double d;
    do {
      d = Math.random();
      System.out.println(d);
    } while (d < 0.7);
    System.out.println("Final value of d: " + d);

  }

}
