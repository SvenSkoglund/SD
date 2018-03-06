package com.skilldistillery.objs.solutions;
public class Account1 {
  private double balance;
  private String accountId;

  public Account1(String aId) {
    accountId = aId;
  }

  public Account1(String aId, double initialBalance) {
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