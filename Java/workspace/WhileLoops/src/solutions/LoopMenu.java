package solutions;

public class LoopMenu {

  public static void main(String[] args) {
    printMenu();
    java.util.Scanner sc = new java.util.Scanner(System.in);
    String choice = "";

    do {
      choice = sc.next();
      switch (choice) {
        case "1":
          printGreeting();
          break;
        case "2":
          printAdvice();
          break;
        case "3":
          printWisdom();
          break;
        case "4":
          printHelp();
          break;
        case "5":
          printGoodbye();
      }
    } while (!choice.equals("5"));

    sc.close();
  }

  public static void printMenu() {
    System.out.println("*****************");
    System.out.println("*   Choose:     *");
    System.out.println("* 1 - Greeting  *");
    System.out.println("* 2 - Advice    *");
    System.out.println("* 3 - Wisdom    *");
    System.out.println("* 4 - Help      *");
    System.out.println("* 5 - Quit      *");
    System.out.println("*****************");
  }

  public static void printGreeting() {
    System.out.println("Hello there. Don't you look lovely today? Choose another option.");
  }

  public static void printAdvice() {
    System.out.println("Advice: You can't use a variable unless it has been initialized.");
  }

  public static void printWisdom() {
    System.out.println("Wisdom: Don't count your chickens if you don't own any chickens. That will just make you sad.");
  }

  public static void printHelp() {
    System.out.println("Help: Enter an option. If you want to quit, enter 5.");
  }

  public static void printGoodbye() {
    System.out.println("Have a nice day.");
  }

}
