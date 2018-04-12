package solutions;

public class MinMaxPrompt {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    int numValues = 5;
    int[] numbers = new int[numValues];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter an integer: ");
      numbers[i] = keyboard.nextInt();
    }
    keyboard.close();

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
