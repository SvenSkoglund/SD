package com.skilldistillery.generics.solutions;

import java.util.ArrayList;

/**
 * Note: this Stack implementation has an issue, in that we could add nulls, but we also 
 * return null for an empty list. We will have to live with this. 
 * 
 */
public class Stack<E> {
  private ArrayList<E> list;
  
  public Stack() {
    list = new ArrayList<>();
  }
  
  public E push(E item) {
    list.add(item);
    return item;
  }
  
  public E pop() {
    if(list.size() == 0) {
      return null;
    }
    return list.remove(list.size() - 1);
  }
  
  public E peek() {
    if(list.size() == 0) {
      return null;
    }
    return list.get(list.size() - 1);
  }
  
  public int search(Object o) {
    int index = -1;
    for (int i = 0; i < list.size(); i++) {
      E item = list.get(i);
      if(item.equals(o)) {
        index = i;
        break;
      }
    }
    return index;
  }
}
