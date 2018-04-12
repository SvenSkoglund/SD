package com.skilldistillery.packages.solutions;

import static com.skilldistillery.Helper.*;
import static com.skilldistillery.packages.Util.*;

public class ProductMainStatics {

  Product product;

  public static void main(String[] args) {
    ProductMainStatics app = new ProductMainStatics();
    app.go();
  }
  
  public ProductMainStatics() {
    product = new Product();
  }
  
  public void go() {
    utilMethod();
    helperMethod();
  }
}
