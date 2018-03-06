package com.skilldistillery.interfaces.solutions.shapes;

public class DrawableTester {

  public static void main(String[] args) {
    DrawableTester tester = new DrawableTester();
    tester.runTest();
  }

  private void runTest() {
    Drawable[] drawables = new Drawable[5];
    drawables[0] = new Rectangle(2.0, 4.0);
    drawables[1] = new Rectangle(5.0, 8.0);
    drawables[2] = new Circle(2.5);

    drawShapes(drawables);
  }

  private void drawShapes(Drawable[] drawables) {
    for (Drawable drawable : drawables) {
      if (drawable != null) {
        drawable.draw();
      }
    }
  }

}
