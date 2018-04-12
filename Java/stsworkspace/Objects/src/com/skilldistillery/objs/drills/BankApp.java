package com.skilldistillery.objs.drills;

public class BankApp {

  public static void main(String[] args) {
    BankApp b = new BankApp();

    b.run();
  }
  
  void run(){
    Account acc1 = new Account("ACC-10001", 305.32);
    Account acc2 = new Account("ACC-10002", 9053.23);
    
    printAccountData(acc1);
    printAccountData(acc2); 
  }
  
  void printAccountData(Account account) {
    System.out.println(account.getAccountId() + " balance: " + account.getBalance());
  }

}
