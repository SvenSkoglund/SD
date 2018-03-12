package com.skilldistillery.regex.solutions;
//id  name  color breed age gender  comments

public class Pet {
  private int    id;
  private String name;
  private String color;
  private String breed;
  private int    age;
  private String gender;
  private String comments;

  public Pet(int id, String name, String color, String breed, int age, String gender, String comments) {
    super();
    this.id = id;
    this.name = name;
    this.color = color;
    this.breed = breed;
    this.age = age;
    this.gender = gender;
    this.comments = comments;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append(name)
        .append(" is a ")
        .append(color)
        .append(" ")
        .append(gender)
        .append(" ")
        .append(breed)
        .append(". S/he is ")
        .append(age)
        .append(" year(s) old and ")
        .append(comments);
    return builder.toString();
  }

}
