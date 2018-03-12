package com.skilldistillery.setinterface.solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

  public static void main(String[] args) {
    SetTest st = new SetTest();
    st.launch();
  }
  
  public void launch() {
    Album al1 = new Album(1, "The Beatles", "The Beatles 1");
    Album al2 = new Album(2, "Prince", "The Very Best of Prince");
    Album al3 = new Album(3, "AC/DC", "Let There Be Rock");
    Album al4 = new Album(3, "AC/DC", "Let There Be Rock");
    
    Set<Album> albumCollection = new HashSet<>();
    
    // Place each call to add in a System.out.println() and run
    // the application.
    System.out.println(albumCollection.add(al1));
    System.out.println(albumCollection.add(al2));
    System.out.println(albumCollection.add(al3));
    System.out.println(albumCollection.add(al4));
    
    printAlbums(albumCollection);
  }
  
  private void printAlbums(Set<Album> collection) {
    Iterator<Album> it = collection.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
