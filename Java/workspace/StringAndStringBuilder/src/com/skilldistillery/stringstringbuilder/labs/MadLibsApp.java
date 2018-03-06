package com.skilldistillery.stringstringbuilder.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MadLibsApp {
  private String[][][] longStories = {
      {
          { "There once was a ", "NOUN" },
          { " from ", "NOUN" },
          { ". It was very ", "ADJECTIVE" },
          { ".\nOne day it ", "VERB" },
          { " a ", "NOUN" }, { ".\n\"", "EXCLAMATION" },
          { "!\" it cried. \"You are some kind of ", "NOUN" },
          { ".\"\n\"", "VERB" },
          { " yourself,\" was the reply.\nThe end.", null }
      }
  };
  private String[][][] shortStories = {
      {
          { "There once was a ", "NOUN" },
          { " from ", "NOUN" },
          { ". It was very ", "ADJECTIVE" },
          { ". One day it ", "VERB" },
          { " a ", "NOUN" },
          { ". There are no words for this kind of ", "VERB" },
          { ". The end.", null }
      },
      {
          { "Once upon a time, a ", "NOUN" },
          { " ", "VERB" },
          { " a ", "NOUN" },
          { ".  It was very ", "ADJECTIVE" },
          { ".", null }
      }
  };

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    MadLibsApp app = new MadLibsApp();
    app.launch(input);

    input.close();
  }

  public void launch(Scanner input) {
    System.out.println("== Welcome to Mad Libs ===");
    mainMenuLoop(input);
    System.out.println(" We hope you had fun, thank you for playing!");
  }

  private void mainMenuLoop(Scanner input) {
    boolean keepGoing = true;
    while (keepGoing) {
      System.out.println("Would you like a long or short story?");
      System.out.println("1. Long story");
      System.out.println("2. Short story");
      System.out.println("0. Quit");
      System.out.print("Choice: ");
      int choice = 0;
      try { choice = input.nextInt(); }
      catch (InputMismatchException e) {
        choice = -1;
      }
      input.nextLine(); // clear input buffer
      switch (choice) {
        case 1:
          outputLongStory(input);
          break;
        case 2:
          outputStory(input);
          break;
        case 0:
          keepGoing = false;
          break;
        case -1:
          System.out.println("Enter a number please.");
          break;
        default:
          System.out.println("That's not an option.");
          break;
      }
    }
  }

  private void outputStory(Scanner input) {
    System.out.println("OK, we'll keep it short.");
    String[][] madLib = shortStories[(int) (Math.random() * shortStories.length)];
    String story = processMadLibs(input, madLib);
    System.out.println("== Story ====================");
    System.out.println(story);
    System.out.println("=============================\n");
  }

  private void outputLongStory(Scanner input) {
    System.out.println("A long story it is, then.");
    String[][] madLib = longStories[(int) (Math.random() * longStories.length)];
    String story = processMadLibs(input, madLib);
    System.out.println("== Story ====================");
    System.out.println(story);
    System.out.println("=============================\n");
  }

  private String processMadLibs(Scanner input, String[][] story) {
    StringBuilder storyBuilder = new StringBuilder();
    for (String[] storyFragment : story) {
      addMadLibInput(input, storyBuilder, storyFragment);
    }
    return storyBuilder.toString();
  }

  private void addMadLibInput(Scanner input, StringBuilder storyBuilder, String[] storyFragment) {
    // Each story fragment has two elements:
    // some story text, and a part of speech.
    // If the part of speech isn't null,
    // - Prompt the user to enter the part of speech.
    // - Read their input with the input Scanner.
    // - Append the input to the StringBuilder.
    // If the part of speech is null, just append the story text.

  }

}
