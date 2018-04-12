package com.skilldistillery.io.examples;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

  public static void main(String[] args) throws IOException {
    InputStreamExample ise = new InputStreamExample();
    ise.readBytes(System.in);
  }

  private void readBytes(InputStream in) throws IOException {
    byte[] byteBuffer = new byte[20];
    System.out.print("Type at least 20 keystrokes on the keyboard and hit Enter: ");
    in.read(byteBuffer); // Read bytes into buffer until it's full.
    for (byte b : byteBuffer) {
      System.out.println("byte: " + b);
    }
    return;
  }

}
