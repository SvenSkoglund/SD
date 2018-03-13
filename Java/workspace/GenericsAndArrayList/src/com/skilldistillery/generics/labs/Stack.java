package com.skilldistillery.generics.labs;

import java.util.ArrayList;

public class Stack <E> {
	ArrayList <E> stack = new ArrayList<>();
	
	// E push(E item) - add an item to the Stack. Return a reference to the item.
	
	public E push(E item) {
		stack.add(item);
		return item;
	}
	// E pop() - remove and return the item at the top of the Stack, or null if the Stack is empty.
	
	public E pop() {
		E removed = null;
		if (stack.size() >0) {
		removed = stack.remove(stack.size()-1);
		}
		return removed;
	}
	// E peek() - return the item at the top of the Stack, but do not remove it. Return null if the Stack is empty.
	
	public E peek() {
		E peaked = null;
		if (stack.size() >0) {
		peaked = stack.get(stack.size()-1);
		}
		return peaked;
	}
	// int search(Object o) - search for the item in the Stack by iterating through the list and calling item.equals(o). Return the index of the item, or -1 if it is not in the Stack.
	public int search(Object o) {
		for (int i = 0 ; i < stack.size()-1 ; i++ ) {	
			if (stack.get(i).equals(o)) {
				return i;
			}
		}
		return -1;

	}
}
