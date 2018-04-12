package com.skilldistillery.stringstringbuilder.solutions;

public class SSNMasker {

  /**
   * Returns an SSN (Social Security Number) string with the first five
   * digits replaced with 'X'.
   * @param ssn
   * An SSN sting in the format 123-45-6789
   * @return
   * A masked SSN string in the format XXX-XX-6789
   */
  public String maskSSN(String ssn) {
    String maskedSSN = null;
    
    // CODE HERE
    // use substring and concatenation to return a masked SSN.
    
    String lastFour = ssn.substring(7,11);
//    String lastFour = ssn.substring(7); // Or this.
    
    maskedSSN = "XXX-XX-" + lastFour;
    
    return maskedSSN;
  }

}
