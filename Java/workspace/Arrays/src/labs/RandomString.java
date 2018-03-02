package labs;

public class RandomString {

	public static void main(String[] args) {
		String[] animals = { "Lion", "Tiger", "Bear", "Beaver", "Cat", "Dog", "Snake", "Lizard", "Frog", "Monkey" };

		for (int i = 0; i < animals.length; i++) {
			double d = Math.random() * animals.length;
			int dInt = (int) d;
			System.out.println(animals[dInt]);
		}

	}

}
