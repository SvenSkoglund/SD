//"Given:

package exceptions;

public class TestClass11 {

	public static void main(String[] args) {
		String myStr = "good";
		char[] myCharArr = { 'g', 'o', 'o', 'd' };

		String newStr = null;
		for (char ch : myCharArr) {
			newStr = newStr + ch;
		}

		System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
		int x;
		System.out.println(x);
	}
}

// What will it print when compiled and run?"