package com.skilldistillery.regex.solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep2 {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Usage: java JGrep pattern filename");
      return;
    }
    boolean caseInsensitive = false;
    if (args.length >= 3) {
      if (args[2].equals("-i")) caseInsensitive = true;
    }
    String regex = args[0];
    String fileName = args[1];
    JGrep2 grepper = new JGrep2();
    grepper.grep(regex, fileName, caseInsensitive);
  }

  private void grep(String regex, String fileName, boolean caseInsensitive) {
    // Global Regular Expression Printer
    int flags = 0;
    if (caseInsensitive) {
      flags = flags | Pattern.CASE_INSENSITIVE;
    }
    Pattern p = Pattern.compile(regex, flags);
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
