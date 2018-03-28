package com.sd.statics;

interface D1 {
	static void method(){}
}
interface D2 {
	static void method(){}
}

public class StaticImplementer implements D1, D2 {
	public static void main(String[] args){
	  // When uncommented, will the following lines compile?
	  
		// method();
	  
		// D1.method();
	}
}

interface D3 extends D1, D2 {
	static void myMethod(){
	  // When uncommented, will the following line compile?
	  
		// method();
	}
}
