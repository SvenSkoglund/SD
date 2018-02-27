package solutions;

import java.util.Scanner;

public class PosNegZero {

  public static void main(String[] args) {
    int number = getNumber();
    String output = number > 0
                    ? "Positive"
                    : number < 0
                      ? "Negative"
                      : "Zero";
    System.out.println(output);

  }

  public static int getNumber() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive whole number: ");
    int input = scan.nextInt();
    scan.close();
    return input;
  }

}
