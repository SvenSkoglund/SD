package solutions;

public class NestedFor1 {

  public static void main(String[] args) {
    for (int outer = 1; outer <= 10; outer++) {

      for (int inner = 1; inner <= 10; inner++) {
        int product = outer * inner;
        System.out.print(product + "\t"); // executes outer 10 * 10 times
      }

      System.out.println(); // executes 10 times
    }
  }

}
