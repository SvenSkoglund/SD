package drills;

public class BooleanTests {

  public static void main(String[] args) {   
    boolean bTrue = true;
    boolean bFalse = false;
    boolean bResult;
    bResult = bFalse &  booleanMethod(1);
    bResult = bFalse && booleanMethod(2);
    bResult = bTrue  |  booleanMethod(3);
    bResult = bTrue  || booleanMethod(4);
    System.out.println(bResult);
  }
  
  private static boolean booleanMethod(int num) {
    System.out.println("I'm booleanMethod: " + num);
    return true;
  }

}
