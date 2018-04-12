package com.skilldistillery.interfaces.solutions.shapes;

public class ThreeDPrinter1 {
  private ThreeDPrintable1[] items;

  public ThreeDPrinter1(int capacity) {
    items = new ThreeDPrintable1[capacity];
  }

  public void addThreeDItem(ThreeDPrintable1 item) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        items[i] = item;
        break;
      }
    }
  }

  public void printAll3DObjects() {
    for (ThreeDPrintable1 threeDPrintable : items) {
      if (threeDPrintable != null) {
        threeDPrintable.threeDPrint();
      }
    }
  }
}
