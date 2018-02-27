package drills;

public class BooleanVariables {

  public static void main(String[] args) {
    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = true;
    System.out.println("b1="+b1+", b2="+b2+", b3="+b3);

    if ( b1 = b2 != b3 ) {
      System.out.println("b1="+b1+", b2="+b2+", b3="+b3);
    }
    
//  if ( b1 != b2 = b3 ) {
//    System.out.println("b1="+b1+", b2="+b2+", b3="+b3);
//  }
 
  }

}
