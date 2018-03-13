package com.skilldistillery.exceptions.labs;

public class ExceptionsLab {

	public static void main(String[] args) {
		System.out.println("main() start.");
		ExceptionsLab lab = new ExceptionsLab();
		lab.run();
		System.out.println("main() end.");
	}

	private void run() {
		System.out.println("run() start.");
		try {
			method1();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e + " was caught");
		}
		System.out.println("run() end.");
	}

	public void method1() throws Exception {
		System.out.println("method1() start.");
		// Uncomment:
		method2();
		System.out.println("method1() end.");
	}

	private void method2() throws Exception {
		System.out.println("method2() start.");
		boolean b = true;
		if (b) {
			Exception ex = new Exception("method2 Exception.");
			throw ex;
		}
		System.out.println("method2() end.");
	}

}
