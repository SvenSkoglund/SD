package com.skilldistillery.generics.solutions;

public class Container<E> {
  private E field;
  
  public void set(E obj) {
    this.field = obj;
  }
  
  public E get() {
    return field;
  }
}