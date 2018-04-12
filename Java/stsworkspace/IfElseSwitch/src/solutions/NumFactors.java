package solutions;

public class NumFactors {

  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    int data = 0;

    System.out.print("Please enter a number: ");
    data = scanner.nextInt();
    scanner.close();

    if (data % 2 == 0) {
      System.out.println(data + " is even.");
    }
    else {
      System.out.println(data + " is odd.");
    }
    if (data % 10 == 0) {
      System.out.println(data + " is divisible by 10.");
    }
    else {
      System.out.println(data + " is not divisible by 10.");
    }
    if (data % 100 == 0) {
      System.out.println(data + " is divisible by 100.");
    }
    else {
      System.out.println(data + " is not divisible by 100.");
    }
  }

}
