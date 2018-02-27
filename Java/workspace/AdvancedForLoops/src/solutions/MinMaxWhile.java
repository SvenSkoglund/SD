package solutions;

public class MinMaxWhile {
  public static void main(String[] args) {
    int[] numbers = { 28, 33, 55, 21, 35 };
    int min = numbers[0];
    int max = numbers[0];

    int i = 0;
    while (i < numbers.length) {
      if (min > numbers[i]) {
        min = numbers[i];
      }
      if (max < numbers[i]) {
        max = numbers[i];
      }
      i++;
    }

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
}
