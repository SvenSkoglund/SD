package com.skilldistillery.io.examples;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputReaderExample {

  public static void main(String[] args) throws IOException {
    InputReaderExample ire = new InputReaderExample();
    ire.readText(System.in);
  }

  private void readText(InputStream input) throws IOException {
    // Wrap, or "decorate" the raw byte InputStream with a Reader
    // that interprets the bytes as characters.
    InputStreamReader reader = new InputStreamReader(input);
    // Array of char, not byte.
    char[] charBuffer = new char[20];
    System.out.print("Type at least 20 keystrokes on the keyboard and hit Enter: ");
    reader.read(charBuffer); // read chars into buffer until it's full.
    for (char c : charBuffer) {
      System.out.println("char: " + c);
    }
  }

}
