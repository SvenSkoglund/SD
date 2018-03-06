package com.skilldistillery.stringstringbuilder.solutions;

public class UserCommentDriver {

  public static void main(String[] args) {
    UserCommentDriver driver = new UserCommentDriver();
    driver.go();
  }

  private void go() {
    UserComment comment1 = new UserComment(42, null, "2018-01-04", "14:59:23", "bdobbs",
        "I love coding in Java!");

    UserComment comment2 = new UserComment(47, comment1, "2018-01-04", "15:03:12", "jsmith",
        "Me too!");
    
    System.out.println(comment1);
    System.out.println(comment2);

  }

}
