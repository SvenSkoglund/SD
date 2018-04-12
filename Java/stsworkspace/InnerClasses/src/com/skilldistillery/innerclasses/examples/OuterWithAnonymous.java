package com.skilldistillery.innerclasses.examples;

public class OuterWithAnonymous {
	class MemberObject extends Object {
		public String toString() {
			return "A custom toString() " + super.toString();
		}
	}

	public void aMethod() {

		class LocalObject extends Object {
			public String toString() {
				return "A custom toString() " + super.toString();
			}
		}

		Object obj = new Object() { // Anonymous class overriding
									// Object's toString() method
			public String toString() {
				return "A custom toString() " + super.toString();
			}
		};

		System.out.println(obj);
	}
}