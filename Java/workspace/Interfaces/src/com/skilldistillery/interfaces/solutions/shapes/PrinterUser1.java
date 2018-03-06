package com.skilldistillery.interfaces.solutions.shapes;

public class PrinterUser1 {

  public static void main(String[] args) {
    ThreeDPrinter1 printer = new ThreeDPrinter1(10);
    printer.addThreeDItem(new ThreeDModel1());
    printer.addThreeDItem(new ThreeDModel1());
    printer.addThreeDItem(new ThreeDModel1());

    printer.printAll3DObjects();
  }

}
