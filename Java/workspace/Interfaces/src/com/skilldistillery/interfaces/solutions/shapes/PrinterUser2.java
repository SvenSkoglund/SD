package com.skilldistillery.interfaces.solutions.shapes;

public class PrinterUser2 {

  public static void main(String[] args) {
    ThreeDPrinter2 printer = new ThreeDPrinter2(10);
    printer.addThreeDItem(new ThreeDModel2());
    printer.addThreeDItem(new ThreeDModel2());
    printer.addThreeDItem(new ThreeDModel2());

    printer.printAll3DObjects();
  }

}
