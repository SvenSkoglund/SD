package com.skilldistillery.packages.solutions;

import com.skilldistillery.*;
import com.skilldistillery.packages.*;

public class ProductMain {

  Product product;

  public static void main(String[] args) {
    ProductMain app = new ProductMain();
    app.go();
  }
  
  public ProductMain() {
    product = new Product();
  }
  
  public void go() {
    Util.utilMethod();
    Helper.helperMethod();
  }
}
