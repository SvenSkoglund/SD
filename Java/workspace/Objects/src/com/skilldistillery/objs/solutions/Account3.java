package com.skilldistillery.objs.solutions;
public class Account3 {
  private double balance;
  private String accountId;

  public Account3(String aId) {
    accountId = aId;
  }

  public Account3(String aId, double initialBalance) {
    balance = initialBalance;
    accountId = aId;
  }
  
  // "getter" and "setter" methods
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    balance = balance - amount;
  }
}