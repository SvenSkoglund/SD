package com.skilldistillery.junit5.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.junit5.drills.Account;

class AccountTests3 {

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
  @DisplayName("Test deposit adds to balance.")
  void testDeposit() {
    account.deposit(50);
    assertEquals(150, account.getBalance());
  }
}
