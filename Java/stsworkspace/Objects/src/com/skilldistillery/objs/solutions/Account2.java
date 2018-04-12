package com.skilldistillery.objs.solutions;
public class Account2 {
  private double balance;
  private String accountId;

  public Account2(String aId) {
    accountId = aId;
  }

  public Account2(String aId, double initialBalance) {
    balance = initialBalance;
    accountId = aId;
  }
  
  // "getter" and "setter" methods
  public double getBalance() {
    return balance;
  }

  public void setBalance(double bal) {
    balance = bal;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String id) {
    accountId = id;
  }

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    balance = balance - amount;
  }
}