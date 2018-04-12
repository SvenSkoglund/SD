package solutions;

public class CountTo {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("You must pass a number on the command line. Exiting.");
      System.exit(1);
    }
    int count = Integer.parseInt(args[0]);
    for (int i=1; i<= count; i++) {
      System.out.println(i);
    }

  }

}
