package com.skilldistillery.games.whiterabbit.io;

import java.util.List;
import java.util.Scanner;

public class SystemIOManager implements IOManager {
  private Scanner sc;
  
  @Override
  public void init() {
    // Create the Scanner
    sc = new Scanner(System.in);

    
  }
  
  @Override
  public void destroy() {
    sc.close();
  }
  
  @Override
  public void print(Drawable d) {
    d.draw();
  }
  
  @Override
  public void print(List<Drawable> menuItems) {
    for (Drawable d : menuItems) {
      d.draw();
    }
  }

  @Override
  public String getUserInput(Drawable d) {
    d.draw();
    String string = sc.nextLine();
    return string.trim();  // Removes newline character
  }
}
