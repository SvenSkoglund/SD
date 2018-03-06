package com.skilldistillery.objs.solutions;

public class BankApp3 {

  public static void main(String[] args) {
    BankApp3 b = new BankApp3();

    b.run();
  }
  
  void run(){
    Account3 acc1 = new Account3("ACC-10001", 305.32);
    Account3 acc2 = new Account3("ACC-10002", 9053.23);
    
    printAccountData(acc1);
    printAccountData(acc2); 
  }
  
  void printAccountData(Account3 account) {
    System.out.println(account.getAccountId() + " balance: " + account.getBalance());
  }

}
