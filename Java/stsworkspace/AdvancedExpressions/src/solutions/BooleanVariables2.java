package solutions;

public class BooleanVariables2 {

  public static void main(String[] args) {
    boolean b1 = false;
    boolean b2 = false;
    boolean b3 = true;
    System.out.println("b1=" + b1 + ", b2=" + b2 + ", b3=" + b3);

    // if ( b1 = b2 != b3 ) {
    // System.out.println("b1="+b1+", b2="+b2+", b3="+b3);
    // }

    /*
     * The if expression ( b1 != b2 = b3 )
     * is equivalent to: ( ( b1 != b2 ) = b3 )
     * Java evaluates left-to-right.
     * - The comparison operator "!=" has higher precedence than the assignment "="
     *   so the comparison of ( b2 != b3 ) would happen first. 
     *   Then Java sees an attempt to assign b3 not to a variable,
     *   but to the comparison expression which makes no sense so compilation fails.
     * 
     * To make this work, we need to override precedence with parentheses.
     * (b1 != (b2 = b3))
     * - Now the assignment of "true" from b3 into b2 happens first.
     *   - The result of the assignment ("true") is then compared to b1 ("false").
     *     They are not equal.
     *     - The overall result of "true" is evaluated by the if.
     */
    // if ( b1 != b2 = b3 ) {
    if ( b1 != (b2 = b3) ) {
      System.out.println("b1=" + b1 + ", b2=" + b2 + ", b3=" + b3);
    }

  }

}
