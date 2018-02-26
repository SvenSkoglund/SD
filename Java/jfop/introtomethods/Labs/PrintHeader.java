public class PrintHeader {
  public static void main (String [] args){

    welcome();


  }
  public static void welcome(){
    printTopBorder();
    printSideBorder();
    printTheHeader();
    printSideBorder();
    printTopBorder();
  }
  public static void printTheHeader(){
    System.out.println("*   Welcome!    *");
  }
  public static void printTopBorder(){
    System.out.println("*****************");
  }
  public static void printSideBorder(){
    System.out.println("*               *");
  }
}
