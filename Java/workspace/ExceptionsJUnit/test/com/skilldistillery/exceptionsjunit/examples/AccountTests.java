package com.skilldistillery.exceptionsjunit.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTests {
  
  @Test(expected=IllegalArgumentException.class)
  public void test_withdraw_throws_IllegalArgumentException_for_negative_input() {
    Account a = new Account(100.0);
    a.withdraw(-0.01);
  }
  
  @Test(expected=Exception.class)
  public void test_withdrawException_throws_Exception_for_negative_input() throws Exception {
    Account a = new Account(100.0);
    a.withdrawException(-0.01);
  }
  
  @Test
  public void test_withdraw_throws_IllegalArgumentException_for_negative_value() {
    Account a = new Account(100.0);
    try {
      a.withdraw(-0.01);
      fail("Expected IllegalArgumentException");
    }
    catch (IllegalArgumentException e) {}
  }
  @Test
  public void test_withdrawException_removes_amount_from_balance() {
    Account a = new Account(100.0);
    try {
      a.withdrawException(50.0);
      assertEquals(50.0, a.getBalance(), 0.01);
    }
    catch (Exception e) {
      fail(e.toString());
    }
  }
}
