package com.skilldistillery.exceptions.drills;

public class FinallyDrill {

	public static void main(String[] args) {
		FinallyDrill drill = new FinallyDrill();
		drill.launch();
		System.err.println("main done.");
	}

	private void launch() {

		try {
			runMethod();
			return;
		}
		catch (Exception e) {
			System.err.println("launch() caught exception");
			System.exit(0);
			return;
		}
		finally {
			System.out.println("luanch () in finally");
			return;
		}
	}

	private void runMethod() {
		try {
			throw new RuntimeException("KaBOOM!");
		}
		catch (RuntimeException exc) {
			System.err.println("runMethod: exception caught, re-throwing.");
			throw exc;
		}

	}

}
