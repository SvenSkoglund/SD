package com.skilldistillery.objs.solutions;

public class BankApp1 {

  public static void main(String[] args) {
    BankApp1 b = new BankApp1();

    b.run();
  }
  
  void run(){
    Account1 acc1 = new Account1("ACC-10001", 305.32);
    Account1 acc2 = new Account1("ACC-10002", 9053.23);
    
    printAccountData(acc1);
    printAccountData(acc2); 
  }
  
  void printAccountData(Account1 account) {
    // This statement no longer compiles, because the accountId and balance
    // fields are now private, and not directly accessible to methods outside
    // of the Account class itself.
//    System.out.println(account.accountId + " balance: " + account.balance);
  }

}
