package com.sd.defaults;

interface InterfaceD1 {
	default void defMethod(){
		System.out.println("ID1 defMethod called");
	}
	
	// Will uncommenting this method compile?
	// default void otherMethod(); 
}

interface InterfaceD2 {
	default void defMethod(){
		System.out.println("ID2 defMethod called");
	}
}

public class TestDefaultInterfaces implements InterfaceD2, InterfaceD1 {
	
	public static void main(String[] args) {
		TestDefaultInterfaces def = new TestDefaultInterfaces();
		def.defMethod();
	}
	// This class must override defMethod() because it is default in both interfaces
	public void defMethod(){}	
	// Comment out the method definition above
	
	
	// Will uncommenting this method compile?
	// public default void defMethod() {}
	
	// Will uncommenting this method compile?
	// protected void defMethod(){}
}

interface D1Extender extends InterfaceD1 {
	// Will these compile when uncommented independently?
  
	// void defMethod() {}
  
	// void defMethod();
	
  // default void defMethod(){ }
	
  // public static void defMethod(){}
}