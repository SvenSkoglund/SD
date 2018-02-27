package com.skilldistillery.numeralsystems.solutions;

public class SkillDrills2 {

  public static void main(String[] args) {
    
    int i1 = 678; // Yes
//    int i2 = 0678; // NO. Leading 0 => octal, no 8 in octal
    int i3 = 0x678; // Yes
    int i4 = 01101; // Yes
    int i5 = 0b1101; // Yes
    int i6 = 0x01101; // Yes
    int i7 = 1101; // Yes
    int i8 = 0x12; // Yes
//    int i9 = 0b12; // NO. Leading 0b => binary, only 0 and 1 allowed
    int ia = 0xb2; // Yes
//    int ib = 0bx2; // NO. Leading 0b => binary, only 0 and 1 allowed
//    int ic = 0b_101_111_111; // NO. _ must have digit or _ on either side
    int id = 0xb10_000; // Yes - b is a valid hexadecimal digit.
    int ie = 0b10_000; // Yes.
    int if_ = 0xCAFE_BABE; // Yes
    
    double d1 = 123.456; // Yes.
    double d2 = 1.235_56; // Yes.
//    double d43 = 123._456; // NO. _ must have digit or _ on either side.

  }

}
