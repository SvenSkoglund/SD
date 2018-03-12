package com.skilldistillery.generics.solutions;

import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayListExample ex = new ArrayListExample();
    ex.run();

  }

  private void run() {
    // Declare and instantiate an ArrayList to hold Strings. 
    // Use the type argument <String> in the constructor.
    ArrayList<String> strings = new ArrayList<String>();
    
    // Declare and instantiate an ArrayList to hold Double objects. 
    // This time use the <> shortcut in the constructor.
    ArrayList<Double> doubles = new ArrayList<>();
    
    // Try to declare an ArrayList to hold double primitives. What happens?
    // ArrayList<double> dubs;  // This is not a helpful error message. The problem is that
                                // ArrayLists can only hold Objects, not primitives.
    
    // Now try declaring an ArrayList without type arguments.
    ArrayList noType = new ArrayList();
    
    // What is the warning Eclipse gives you?
    // "ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized"
    
    // What combinations of <> and <String> can you put on either side of the =, and still have the code compile?
    ArrayList<String> list1 = new ArrayList();  // compiles
    ArrayList list2 = new ArrayList<>();        // compiles
    //ArrayList<> list3 = new ArrayList();      // Does not compile. Using <> in the variable
                                                // declaration requires a Type.
    
  }

}
