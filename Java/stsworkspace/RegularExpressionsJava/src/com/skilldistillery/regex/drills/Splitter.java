package com.skilldistillery.regex.drills;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Splitter {
  public static void main(String[] args) {
    Splitter s = new Splitter();
    List<Pet> pets = s.parseFile("pets.txt");
    for (Pet pet : pets) {
      System.out.println(pet);
    }
  }

  private List<Pet> parseFile(String fileName) {
    List<Pet> pets = new ArrayList<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String line = br.readLine(); 
      //int id = 0;// Read and discard header line
      //id,  name  color breed age gender  comments
      while ((line = br.readLine()) != null) {
        // Split each line into fields,
    	  String [] stArr = line.split(",?\\t");
    	  int id = Integer.parseInt(stArr[0]);
    	  String name =stArr[1];
    	  String color =stArr[2];
    	  String breed =stArr[3];
    	  int age = Integer.parseInt(stArr[4]);
    	  String gender =stArr[5];
    	  String comments =stArr[6];
    	  Pet newPet = new Pet(id, name, color, breed, age, gender, comments);
    	  pets.add(newPet);
        // use the fields to construct a Pet object and add it to the pets list
        // Fields are separated by a tab that's optionally preceded by a comma.

      }
      br.close();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return pets;
  }

}
