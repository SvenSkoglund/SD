import java.util.Scanner;

public class FiveIntegers {
  public static void main ( String [] args ){
    /* Write a program that prompts the user for a list of five integers. Place each of the numbers in a separate variable, then:

      Print each of the numbers separated by a space.
      Print each of the numbers separated by a tab.
      Print each of the numbers separated by a newline.
      */

      int first, second, third, fourth, fifth;
      first = promptInt();
      second = promptInt();
      third = promptInt();
      fourth = promptInt();
      fifth = promptInt();


      printSpace(first,second,third,fourth,fifth);
      printTabs(first,second,third,fourth,fifth);
      printLines(first,second,third,fourth,fifth);
}





  public static int promptInt(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an intiger: ");
    return scanner.nextInt();
  }
  public static void printSpace(int first, int second, int third, int fourth, int fifth){
          System.out.println("" + first + " " + second + " " + third + " " + fourth + " " + fifth);
  }
  public static void printTabs(int first, int second, int third, int fourth, int fifth){
            System.out.println("" + first + "\t" + second + "\t" + third + "\t" + fourth + "\t" + fifth);
  }
  public static void printLines(int first, int second, int third, int fourth, int fifth){
        System.out.println("" + first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth);
  }
}
