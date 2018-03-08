package com.skilldistillery.caesarcipher;

import java.util.Scanner;

public class CaesarCipherApp {

  static CaesarCipher cc = new CaesarCipher();

  public static void main(String[] args) {
    run();
  }

  public static void run() {
    while (true) {
      int entry = encryptOrDecrypt();
      if (entry == 3) {
        System.out.println("Exiting program...");
        System.exit(0);
      }
      int i = getOffsetFromUser();
      String s = getStringFromUser(entry);
      if (entry == 1) {
        System.out.println(cc.encrypt(s, i));

      } else if (entry == 2) {
        System.out.println(cc.decrypt(s, i));

      }
    }
  }

  private static String getStringFromUser(int i) {
    String s;
    Scanner input = new Scanner(System.in);
    if (i == 1) {
      System.out.println("Please enter a string to be Encrypted: ");
      s = input.nextLine();
    } else if (i == 2) {
      System.out.println("Please enter a string to be Decrypted: ");
      s = input.nextLine();
    } else {
      return s = "";
    }
    return s;

  }

  private static int encryptOrDecrypt() {
    Scanner input = new Scanner(System.in);
    int i;
    while (true) {
      System.out.println("Enter 1 to Encrypt your String, 2 to Decrypt, or 3 to QUIT.");
      i = input.nextInt();
      if (i == 1 || i == 2 || i == 3) {
        break;
      } else {
        System.out.println("You must enter a valid selection! ");
      }
    }
    return i;
  }

  private static int getOffsetFromUser() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount to offset: ");
    int i = input.nextInt();
    // input.close();
    return i;
  }
}
