package com.skilldistillery.caesarcipher;

public class CaesarCipher {

  public String encrypt(String text, int shift) {
    String result = "";
    if (text == null) {
      return null;
    }
    while (shift > 26) {
      shift = shift - 26;
    }
    // create char array from string
    char stringToChar[] = text.toCharArray();
    for (int i = 0; i < stringToChar.length; i++) {
      stringToChar[i] = encryptChar(stringToChar[i], shift);
      result = result + stringToChar[i];
    }

    // Encryption logic here
    return result;
  }

  public String decrypt(String text, int shift) {
    String result = "";
    if (text == null) {
      return null;
    }
    while (shift > 26) {
      shift = shift - 26;
    }
    char stringToChar[] = text.toCharArray();
    for (int i = 0; i < stringToChar.length; i++) {
      stringToChar[i] = decryptChar(stringToChar[i], shift);
      result = result + stringToChar[i];
    }
    return result;
  }

  // takes in char, checks for upper/lower case, shifts by an integer
  private char encryptChar(char toEncrypt, int shift) {
    int toInt = (int) (toEncrypt);
    // check for upper case
    if (toInt >= 65 && toEncrypt <= 90) {
      // check for out of bounds on ascii table
      if (toInt + shift > 90) {
        toInt = toInt - 26;
        toInt = toInt + shift;
      } else {
        toInt = toInt + shift;
      }
      // check for lower case
    } else if (toEncrypt >= 97 && toEncrypt <= 122) {
      if (toInt + shift > 122) {
        // check for out of bounds on ascii table
        toInt = toInt - 26;
        toInt = toInt + shift;
      } else {
        toInt = toInt + shift;
      }
    }
    return (char) (toInt);
  }

  // same as encrypt but backwards
  private char decryptChar(char toDecrypt, int shift) {
    int toInt = (int) (toDecrypt);
    // checking for upper/lowercase
    if (toInt >= 65 && toInt <= 90) {
      if (toInt - shift < 65) {
        toInt = toInt + 26;
        toInt = toInt - shift;
      } else {
        toInt = toInt - shift;
      }
    } else if (toInt >= 97 && toInt <= 122) {
      if (toInt - shift < 97) {
        toInt = toInt + 26;
        toInt = toInt - shift;
      } else {
        toInt = toInt - shift;
      }
    }
    return (char) (toInt);
  }

}