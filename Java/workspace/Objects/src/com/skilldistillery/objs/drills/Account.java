package com.skilldistillery.objs.drills;
public class Account {
  public double balance;
  public String accountId;

  public Account(String aId) {
    accountId = aId;
  }

  public Account(String aId, double initialBalance) {
    balance = initialBalance;
    accountId = aId;
  }

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    balance = balance - amount;
  }
}