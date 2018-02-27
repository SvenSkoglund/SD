package solutions;

public class RemoteControlLoop {

  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("To begin, turn on the remote control: ");

    while (true) {
      String button = scanner.next();
      if ("ON".equals(button)) {
        turnOn();
        break;
      }
    }
    while (true) {
      String button = scanner.next();
      switch (button) {
        case "0":
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
        case "6":
        case "7":
        case "8":
        case "9":
          pressButton();
          break;
        case "OFF":
          turnOff();
          break;
        default:
          error();
      }
      if ("OFF".equals(button)) {
        break;
      }
    }

    scanner.close();
  }

  private static void turnOn() {
    System.out.println("TURNING ON...");
  }

  private static void turnOff() {
    System.out.println("TURNING OFF...");
  }

  public static void pressButton() {
    System.out.println("BOOP!");
  }

  public static void error() {
    System.out.println("Command not recognized.");
  }
}
