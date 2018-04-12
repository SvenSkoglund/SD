package com.skilldistillery.interfaces.solutions.shapes;

public class ThreeDPrinter2 {
  private ThreeDPrintable2[] items;

  public ThreeDPrinter2(int capacity) {
    items = new ThreeDPrintable2[capacity];
  }

  public void addThreeDItem(ThreeDPrintable2 item) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        items[i] = item;
        break;
      }
    }
  }

  public void printAll3DObjects() {
    for (ThreeDPrintable2 threeDPrintable : items) {
      if (threeDPrintable != null) {
        threeDPrintable.threeDPrint();
      }
    }
  }
}
