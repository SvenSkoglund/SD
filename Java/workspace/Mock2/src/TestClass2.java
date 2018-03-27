
public class TestClass2 {

	public static void main(String[] args) {
		new JustLooping().showJ();
	}

	public class JustLooping {
		private int j;

		void showJ() {
			while (j <= 5) {
				for (int j = 1; j <= 5;) {
					System.out.print(j + " ");
					j++;
				}
				j++;
			}
		}
	}

//	What is
//	the result?"
}

}
