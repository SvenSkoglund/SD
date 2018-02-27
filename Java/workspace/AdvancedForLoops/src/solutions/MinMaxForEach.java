package solutions;
public class MinMaxForEach {
  public static void main(String[] args) {
    int[] numbers = { 28, 33, 55, 21, 35 };
    int min = numbers[0];
    int max = numbers[0];

    for (int num : numbers) {
      if (min > num) {
        min = num;
      }
      if (max < num) {
        max = num;
      }
    }

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
}
