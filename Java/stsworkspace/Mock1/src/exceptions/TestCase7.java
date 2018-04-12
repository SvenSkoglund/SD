package exceptions;

//"What will the following code print when run?
public class TestCase7 {
	public void switchString(String input) {
		switch (input) {
		case "a":
			System.out.println("apple");
		case "b":
			System.out.println("bat");
			break;
		case "B":
			System.out.println("big bat");
		default:
			System.out.println("none");
		}
	}

	public static void main(String[] args) throws Exception {
		TestCase7 tc = new TestCase7();
		tc.switchString("B");
	}
}