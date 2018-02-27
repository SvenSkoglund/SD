package solutions;

public class Reverse {
  public static void main(String[] args) {
    int number = 123456;
    int reverse = reverseNumber(number);

    System.out.println("Original: " + number);

    System.out.println("Reverse: " + reverse);
  }

  public static int reverseNumber(int number) {
    int reverse = 0;
    while (number != 0) {
      reverse = reverse * 10;
      reverse = reverse + number % 10;
      number = number / 10;
    }
    return reverse;
  }
}
