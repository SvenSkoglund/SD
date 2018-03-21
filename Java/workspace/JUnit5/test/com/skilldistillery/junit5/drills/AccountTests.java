package com.skilldistillery.junit5.drills;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AccountTests {
	
	private Account account;
	@BeforeEach
	void setUp() throws Exception {
		account = new Account(100);
	}

	@AfterEach
	void tearDown() throws Exception {
		account = null;
	}

	@Test
	  @DisplayName("Test deposit adds to balance.")
	  void testDeposit() {
	    account.deposit(100);
	    assertEquals(200, account.getBalance());
	    account.deposit(100);
	    assertEquals(300, account.getBalance());
	  }

}
