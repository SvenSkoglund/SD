package com.skilldistillery.regex.solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Usage: java JGrep pattern filename");
      return;
    }
    String regex = args[0];
    String fileName = args[1];
    JGrep grepper = new JGrep();
    grepper.grep(regex, fileName);
  }

  private void grep(String regex, String fileName) {
    // Global Regular Expression Printer
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher("");
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String line;
      while ((line = br.readLine()) != null) {
        m.reset(line);
        if (m.find()) {
          System.out.println(line);
        }
      }
      br.close();
    }
    catch (FileNotFoundException e) {
      System.err.println("File not found: " + fileName);
      return;
    }
    catch (IOException e) {
      e.printStackTrace();
      return;
    }
  }

}
