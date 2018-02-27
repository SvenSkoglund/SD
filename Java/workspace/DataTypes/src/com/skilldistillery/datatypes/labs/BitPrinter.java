package com.skilldistillery.datatypes.labs;

public class BitPrinter {
  public static void main(String[] args) {
    
    BitPrinter bp = new BitPrinter();
    System.out.println("3.14 is \t\t" + bp.getDataAsBits("3.14"));
    System.out.println("129 is \t\t" + bp.getDataAsBits("129"));
  }
  
  public String getDataAsBits(String input){
    String output = null;
    if(input == null || input.isEmpty()){
      return null;
    }
    try {
      output = getBits(Integer.parseInt(input));
    } catch (NumberFormatException e) {
      try {
        output = getBits(Double.parseDouble(input));
      } catch (NumberFormatException e1) {
        //must be a char
        output = getBits(input.charAt(0));
      }
    }

    return output;
  }

  public String padZeroes(int length, String str){
    return String.format("%"+length+"s", str).replace(" ", "0");
  }
  private String getBits(int input){
    String output = padZeroes(Integer.BYTES * 8, Integer.toBinaryString(input));
    return output;
  }

  private String getBits(char input){
    String output = null;
    String b = Integer.toBinaryString(input);
    if (b.length() < 16) {
            output = "00000000000000000".substring(0, 16 - b.length()).concat(b);
        } else {
            output = b.substring(b.length() - 16);
        }
    return output;
  }

  private String getBits(double input){
    String output = padZeroes(Double.BYTES * 8, Long.toBinaryString(Double.doubleToRawLongBits(input)));

    return output;
  }
}
