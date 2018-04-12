package com.skilldistillery.regex.examples;

public class StringMethodsDemo {

  public static void main(String[] args) {
    StringMethodsDemo s = new StringMethodsDemo();

    s.matchesExamples();
    s.splitExample();
    s.replaceFirstExample();
    s.replaceAllExample();
  }

  private void matchesExamples() {
    System.out.println("String.matches() - the regex must match the entire string");
    System.out.println("Hello, World".matches("\\w+")); // false
    System.out.println("Hello, World".matches("\\w*, \\w+")); // true
    System.out.println("Hello, World".matches(".+")); // true
    System.out.println();
  }

  private void splitExample() {
    System.out.println("String.split() - returns a String array");
    String data = "One potato,two potahto,  three potayto, four";
    System.out.println("Original string: \"" + data + "\"");
    String[] fields = data.split(",\\s*");
    for (String field : fields) {
      System.out.println("Field: " + field);
    }
    System.out.println();
  }

  private void replaceFirstExample() {
    System.out.println("String.replaceFirst() - return new string with first match replaced;");
    System.out.println("                        original string is not modified");
    String data = "One potato,two potahto,  three potayto, four";
    System.out.println(data.replaceFirst("po\\w+to", "giraffe"));
    System.out.println(data);
    System.out.println();
  }

  private void replaceAllExample() {
    System.out.println("String.replaceAll() - return new string with all matches replaced");
    String data = "One potato,two potahto,  three potayto, four";
    System.out.println(data.replaceAll("po\\w+to", "giraffe"));
  }

}
