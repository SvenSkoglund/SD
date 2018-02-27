package drills;

public class NestedFor1 {

  public static void main(String[] args) {
    for (int outer = 1; outer <= 10; outer++) {

      for (int inner = 1; inner <= 10; inner++) {
        int product = outer * inner;
        System.out.print(product + "\t");
      }

      System.out.println();
    }
    // Run the above code.
    // How many times does the the second output statement execute?
  }

}
