package solutions;

public class NestedFor2 {

  public static void main(String[] args) {
    // Write a nested for loop to print the numbers 0 to 9 five times.
    // Output:
    // 0 1 2 3 4 5 6 7 8 9
    // 0 1 2 3 4 5 6 7 8 9
    // 0 1 2 3 4 5 6 7 8 9
    // 0 1 2 3 4 5 6 7 8 9
    // 0 1 2 3 4 5 6 7 8 9
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
