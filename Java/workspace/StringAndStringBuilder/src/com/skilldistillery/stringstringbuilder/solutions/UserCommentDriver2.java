package com.skilldistillery.stringstringbuilder.solutions;

public class UserCommentDriver2 {

  public static void main(String[] args) {
    UserCommentDriver2 driver = new UserCommentDriver2();
    driver.go();
  }

  private void go() {
    UserComment2 comment1 = new UserComment2(42, null, "2018-01-04", "14:59:23", "bdobbs",
        "I love coding in Java!");

    UserComment2 comment2 = new UserComment2(47, comment1, "2018-01-04", "15:03:12", "jsmith",
        "Me too!");
    
    System.out.println(comment1);
    System.out.println(comment2);

  }

}
