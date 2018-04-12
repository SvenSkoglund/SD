package exceptions;

//"The following class will print 'index = 2' when compiled and run.

class TestClass30 {
	public static int[] getArray() {
		return null;
	}

	public static void main(String[] args) {
		int index = 1;
		try {
			getArray()[index = 2]++;
			System.out.println("index has been incrememnted");
		}
		catch (Exception e) {
		} // empty catch
		System.out.println("index = " + index);
	}
}