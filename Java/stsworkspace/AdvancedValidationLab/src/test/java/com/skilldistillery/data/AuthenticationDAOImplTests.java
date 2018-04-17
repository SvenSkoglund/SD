package com.skilldistillery.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthenticationDAOImplTests {

  AuthenticationDAOImpl dao;
  
  @BeforeEach
  void setUp() {
    dao = new AuthenticationDAOImpl();
  }
  
  @AfterEach
  void tearDown() {
    dao = null;
  }
  
  @Test
  @DisplayName("Test create adds User to DAO")
  public void testCreate() {
    User newUser = new User("email@email.com", "FirstName", "LastName", "password", 30);
    User created = dao.create(newUser);
    assertNotNull(created);
    assertEquals("email@email.com", created.getEmail());
  }
  
  @Test
  @DisplayName("Test create returns null trying to add already existing User to DAO")
  public void testCreateNegative() {
    User newUser = new User("admin@admin.com", "FirstName", "LastName", "passwor", 30);
    User created = dao.create(newUser);
    assertNull(created);
  }
  
  @Test
  @DisplayName("Test getUserByEmail returns null for non-existent user")
  public void testGetByEmailNegative() {
    User u = dao.getUserByEmail("XXX");
    assertNull(u);
  }
  
  @Test
  @DisplayName("Test getUserByEmail returns User for valid user")
  public void testGetByEmailReturns() {
    User u = dao.getUserByEmail("admin@admin.com");
    assertNotNull(u);
    assertEquals(Integer.valueOf(22), u.getAge());
    assertEquals("admin@admin.com", u.getEmail());
    assertEquals("admin", u.getFirstName());
  }
  
  @Test
  @DisplayName("Test isEmailUnique returns false for email already in the DAO")
  public void testEmailUniqueNegative() {
    assertFalse(dao.isEmailUnique("admin@admin.com"));
  }
  
  @Test
  @DisplayName("Test isEmailUnique returns true for email not in the DAO")
  public void testEmailUniquePositive() {
    assertTrue(dao.isEmailUnique("XXX@YYY.com"));
  }
  
  @Test
  @DisplayName("Test isValidUser returns true for User with valid email and password")
  public void testIsValidUserPositive() {
    User u = new User("admin@admin.com", "admin", "admin", "password", 22);
    boolean result = dao.isValidUser(u);
    assertTrue(result);
  }
  
  @Test
  @DisplayName("Test isValidUser returns false for User with valid email and invalid password")
  public void testIsValidUserNegative() {
    User u = new User("admin@admin.com", "admin", "admin", "passwordXXX", 22);
    boolean result = dao.isValidUser(u);
    assertFalse(result);
  }
  
  @Test
  @DisplayName("Test isValidUser returns false for User with invalid email and password")
  public void testIsValidUserNegative2() {
    User u = new User("XXX", "admin", "admin", "password", 22);
    boolean result = dao.isValidUser(u);
    assertFalse(result);
  }
 
}
