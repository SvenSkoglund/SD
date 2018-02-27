package solutions;

public class BooleanVariables {

  public static void main(String[] args) {
    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = true;
    System.out.println("b1="+b1+", b2="+b2+", b3="+b3);

    /*
     * The if expression is equivalent to:
     *   b1 = ( b2 != b3 )
     * Java evaluates left-to-right.
     * - The assignment operator "=" associates right-to-left,
     *   so the comparison of ( b2 != b3 ) happens first,
     *   yielding "true" (b2 and b3 are not equal).
     *   - This result is then assigned to b1.
     *     - The overall result of "true" is evaluated by the if.
     */
    if ( b1 = b2 != b3 ) {
      System.out.println("b1="+b1+", b2="+b2+", b3="+b3);
    }
    
//  if ( b1 != b2 = b3 ) {
//    System.out.println("b1="+b1+", b2="+b2+", b3="+b3);
//  }
 
  }

}
