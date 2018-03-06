package com.skilldistillery.objs.solutions;

public class BankApp2 {

  public static void main(String[] args) {
    BankApp2 b = new BankApp2();

    b.run();
  }
  
  void run(){
    Account2 acc1 = new Account2("ACC-10001", 305.32);
    Account2 acc2 = new Account2("ACC-10002", 9053.23);
    
    printAccountData(acc1);
    printAccountData(acc2); 
  }
  
  void printAccountData(Account2 account) {
    System.out.println(account.getAccountId() + " balance: " + account.getBalance());
  }

}
