public class MyName {
  public static void main (String [] args){
    firstName();
    space();
    lastName();
    System.out.println();
    fullName();
  }
  public static void firstName(){
    System.out.print("Sven");
  }
  public static void space(){
    System.out.print(" ");
  }
  public static void lastName(){
    System.out.print("Skoglund");
  }
  public static void fullName(){
    firstName();
    space();
    lastName();
    System.out.println();
  }
}
