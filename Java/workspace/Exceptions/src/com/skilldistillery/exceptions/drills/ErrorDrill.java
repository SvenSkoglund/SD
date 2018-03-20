package com.skilldistillery.exceptions.drills;

public class ErrorDrill {
	private static int callCount = 0;

	public static void main(String[] args) {
		ErrorDrill drill = new ErrorDrill();
		drill.callMe();
	}

	private void callMe() {
		// 1. Increment callCount
		callCount++;
		// 2. Print out callCount
		System.out.println(callCount);
		// 3. Call callMe()
		callMe();
		// 4. Print "callMe finished."
		System.out.println("callMe finished");
	}

}
