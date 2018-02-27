package solutions;

public class ShowMe {
  public static void main(String[] args) {
    System.out.println(args);
    System.out.println(args.length);
    for (int i = 0; i < args.length; i++) {
      System.out.println(i + ": " + args[i]);
    }
  }
}
