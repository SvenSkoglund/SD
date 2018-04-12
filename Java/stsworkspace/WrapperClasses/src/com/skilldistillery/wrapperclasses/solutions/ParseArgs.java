package com.skilldistillery.wrapperclasses.solutions;

public class ParseArgs {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java ParseArgs number boolean");
      System.exit(1);
    }
    
    int count = Integer.parseInt(args[0]);
    boolean b = Boolean.parseBoolean(args[1]);
    
    if (b) {
      for (int i = 0; i <= count; i++) {
        System.out.println(i);
      }
    }
    else {
      for (int i = count; i >= 0; i--) {
        System.out.println(i);
      }      
    }

  }

}
