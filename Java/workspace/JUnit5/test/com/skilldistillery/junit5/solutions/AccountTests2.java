package com.skilldistillery.junit5.solutions;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.junit5.drills.Account;

class AccountTests2 {
  
  private Account account;

  @BeforeEach
  void setUp() {
    account = new Account(100);
  }

  @AfterEach
  void tearDown() {
    account = null;
  }
  
  @Test
  void test() {
    fail("Not yet implemented");
  }
}
