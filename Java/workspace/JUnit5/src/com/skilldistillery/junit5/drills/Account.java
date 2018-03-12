package com.skilldistillery.junit5.drills;

public class Account {
  private double balance;

  public Account(double initialBalance) {
    balance = initialBalance;
  }
  public void withdraw(double amount) {
    if(amount < 0.0) {
      throw new IllegalArgumentException("Amount cannot be less than zero.");
    }
    balance -= amount;
  }
  public void withdrawException(double amount) throws Exception {
    if(amount < 0.0) {
      throw new Exception("Amount cannot be less than zero.");
    }
    balance -= amount;
  }
  public void deposit(double amount) {
    double tempBalance = balance;
    tempBalance = tempBalance + amount;
    balance = tempBalance;
  }
  public double getBalance() {
    return balance;
  }
}
