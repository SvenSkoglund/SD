package com.skilldistillery.stringstringbuilder.solutions;

public class UserCommentDriver3 {

  public static void main(String[] args) {
    UserCommentDriver3 driver = new UserCommentDriver3();
    driver.go();
  }

  private void go() {
    UserComment3 comment1 = new UserComment3(42, null, "2018-01-04", "14:59:23", "bdobbs",
        "I love coding in Java!");

    UserComment3 comment2 = new UserComment3(47, comment1, "2018-01-04", "15:03:12", "jsmith",
        "Me too!");
    
    System.out.println(comment1);
    System.out.println(comment2);

  }

}
