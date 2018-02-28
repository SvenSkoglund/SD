package labs;

import java.util.Scanner;

public class TriangleCalc {

	public static void main(String[] args) {
		int num = getNumber();
		int tri = calcTri(num);
		String calcTriString = calculateTriangleString(num);
		System.out.println(calcTriString);
		System.out.println("The triangle of " + num + " equals " + tri);
	}

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to calculate the triangle");
		return sc.nextInt();
	}

	public static int calcTri(int num) {
		num = num * (num + 1) / 2;
		return num;
	}

	public static String calculateTriangleString(int num) {
		String triString = ("");
		int originalNum = num;
		while (num > 0) {
			if (num == originalNum) {
				triString = (triString + num);
			}
			else {
				triString = (num + " + " + triString);
			}
			num--;
		}
		return triString;
	}
}
