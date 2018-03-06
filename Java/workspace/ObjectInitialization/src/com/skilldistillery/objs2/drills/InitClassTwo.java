package com.skilldistillery.objs2.drills;

public class InitClassTwo {
//Constructor
 InitClassTwo() {
   initCallout("\tconstructor - line 16");
 }
 
 boolean instance1 = initCallout("\tinstance field - line 9");
 
 static boolean staticTwo = initCallout("static field - line 11");
 
 {
   initCallout("\tinstance init block - line 14");
 }
 
 static {
   initCallout("static init block - line 18");
 }
 
 boolean instance2 = initCallout("\tinstance field - line 21");
 
 static boolean initCallout(String fieldName) {
   System.out.println("InitClassTwo " + fieldName);
   return false;
 }
}
