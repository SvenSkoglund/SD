package com.skilldistillery.generics.drills;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.generics.solutions.Stack;

public class StackTests {

  private Stack<String> stack;
  
  @Before
  public void setUp() throws Exception {
    stack = new Stack<>();
  }

  @After
  public void tearDown() throws Exception {
    stack = null;
  }

  @Test
  public void test_push_adds_to_stack_and_pop_removes_in_order() {
    stack.push("A");
    stack.push("B");
    stack.push("C");
    assertEquals("C", stack.pop());
    assertEquals("B", stack.pop());
    stack.push("D");
    assertEquals("D", stack.pop());
    assertEquals("A", stack.pop());
  }
  
  @Test
  public void test_push_adds_to_stack_and_peek_twice_shows_same_object_on_top_of_stack() {
    stack.push("A");
    stack.push("B");
    stack.push("C");
    assertEquals("C", stack.peek());
    assertEquals("C", stack.peek());
    assertEquals("C", stack.peek());
  }
  @Test
  public void test_search() {
    stack.push("A");
    stack.push("B");
    stack.push("C");
    assertEquals(2, stack.search("C"));
    assertEquals(1, stack.search("B"));
    assertEquals(0, stack.search("A"));
    assertEquals("C", stack.peek());
    assertEquals("C", stack.peek());
  }
  
  @Test
  public void test_pop_empty_stack_returns_null() {
    assertNull(stack.pop());
  }
  
  @Test
  public void test_peek_empty_stack_returns_null() {
    assertNull(stack.peek());
  }

}
