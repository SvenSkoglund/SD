package solutions;

public class ForLoopBody2 {

  public static void main(String[] args) {
    /*
     * The for loops below have errors. Copy each loop and paste below the block
     * comment. Fix the code so that it can compile.
     */
    // Loop 1
    // int x = 0; // Can't declare x both here and in the for().
    for (int y = 0, x = 10; x + y < 15; x++, y++) {
      System.out.println(x + y);
    }

    // Loop 2
    // Can't declare two different type in the initialization.
    // for(int a = 0, short b = 4; a < 5; a++, b++) {
    for (int a = 0, b = 4; a < 5; a++, b++) {
      System.out.println("a is " + a + ", b is " + b);
    }

    // Loop 3
    // If q is declared in the for(), it will be out of scope after the loop body.
    // for (int q = 5; q < 10; q++) {
    int q = 5;
    for (q = 5; q < 10; q++) {
      System.out.println(q);
    }
    System.out.println("q is now " + q);

  }

}
